/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */

package org.odpi.openmetadata.accessservices.datamanager.fvt.execution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.odpi.openmetadata.fvt.utilities.FVTConstants;
import org.odpi.openmetadata.accessservices.datamanager.fvt.errorhandling.InvalidParameterTest;
import org.odpi.openmetadata.fvt.utilities.FVTResults;
import org.odpi.openmetadata.fvt.utilities.exceptions.FVTTestFailureException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * DataManagerOMASInvalidParameterIT is the failsafe wrapper for InvalidParameterTest.
 */
public class DataManagerOMASInvalidParameterIT
{
    @ParameterizedTest
    @ValueSource(strings = {"serverinmem","servergraph"})
    public void testInvalidParameters(String server)
    {
        assertDoesNotThrow(() -> runInvalidParameters(server));
    }


    public void runInvalidParameters(String serverName) throws FVTTestFailureException
    {
        FVTResults results = InvalidParameterTest.performFVT(serverName, FVTConstants.SERVER_PLATFORM_URL_ROOT, FVTConstants.USERID);

        results.printResults();
        if (! results.isSuccessful())
        {
            throw new FVTTestFailureException(results);
        }
    }
}
