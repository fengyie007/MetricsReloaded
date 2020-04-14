/*
 * Copyright 2005-2016 Sixth and Red River Software, Bas Leijdekkers
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.sixrr.stockmetrics.packageCalculators;

import com.intellij.psi.PsiPackage;
import com.sixrr.stockmetrics.execution.BaseMetricsCalculator;

public abstract class PackageCalculator extends BaseMetricsCalculator {

    void postMetric(PsiPackage aPackage, int numerator, int denominator) {
        resultsHolder.postPackageMetric(metric, aPackage, (double) numerator, (double) denominator);
    }

    void postMetric(PsiPackage aPackage, int value) {
        resultsHolder.postPackageMetric(metric, aPackage, (double) value);
    }

    void postMetric(PsiPackage aPackage, double value) {
        resultsHolder.postPackageMetric(metric, aPackage, value);
    }
}