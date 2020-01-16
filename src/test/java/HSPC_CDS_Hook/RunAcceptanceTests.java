/*
* Copyright 2002 - 2017 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package HSPC_CDS_Hook;

import Help.utils.session.Key;
import Help.utils.session.Session;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm"},
        junit = {"--filename-compatible-names"},
        tags = {"@Test"}
)

public class RunAcceptanceTests {
    @AfterClass
    public static void teardown()
    {
        String count = Session.getCurrentSession().get(Key.Keys.COUNT).toString();
        String passedTests = Session.getCurrentSession().get(Key.Keys.PASSED_TESTS).toString();
        String failedTests = Session.getCurrentSession().get(Key.Keys.FAILED_TESTS).toString();
        String message = "*Total* executed tests: " + count + "\n"
                + "*Passed* tests: " + passedTests +", *Failed* tests: "+ failedTests + "\n";

    }
}
