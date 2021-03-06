/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-completion/testData/injava/stdlib")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinStdLibInJavaCompletionTestGenerated extends AbstractKotlinStdLibInJavaCompletionTest {
    public void testAllFilesPresentInStdlib() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/injava/stdlib"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, false);
    }

    @TestMetadata("List.java")
    public void testList() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/injava/stdlib/List.java");
        doTest(fileName);
    }
}
