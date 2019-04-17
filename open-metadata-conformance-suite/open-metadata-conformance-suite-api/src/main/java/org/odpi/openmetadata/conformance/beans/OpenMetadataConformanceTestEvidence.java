/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.conformance.beans;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

/**
 * OpenMetadataConformanceTestEvidence is a bean for describing a single piece of the test evidence that a particular
 * conformance requirement is being met that is generated by one of the conformance suite test cases.
 */
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class OpenMetadataConformanceTestEvidence implements Serializable
{
    private static final long   serialVersionUID = 1L;

    private Integer                                 profileId              = null;
    private Integer                                 requirementId          = null;
    private String                                  testCaseId             = null;
    private String                                  testCaseName           = null;
    private String                                  testCaseDescriptionURL = null;
    private OpenMetadataConformanceTestEvidenceType testEvidenceType       = null;
    private String                                  assertionMessage       = null;
    private String                                  propertyName           = null;
    private Object                                  propertyValue          = null;
    private ExceptionBean                           conformanceException   = null;


    /**
     * Default Constructor used when converting from JSON
     */
    public OpenMetadataConformanceTestEvidence()
    {
        super();
    }


    /**
     * Return the message to confirm the outcome of the test.
     *
     * @return string message
     */
    public String getAssertionMessage()
    {
        return assertionMessage;
    }


    /**
     * Set up the message to confirm the outcome of the test.
     *
     * @param assertionMessage string message
     */
    public void setAssertionMessage(String assertionMessage)
    {
        this.assertionMessage = assertionMessage;
    }


    /**
     * Return the identifier of the profile that this test evidence supports.
     *
     * @return string id
     */
    public Integer getProfileId()
    {
        return profileId;
    }


    /**
     * Set up the identifier of the profile that this test evidence supports.
     *
     * @param profileId string id
     */
    public void setProfileId(Integer profileId)
    {
        this.profileId = profileId;
    }


    /**
     * Return the identifier of the profile's requirement that this test evidence supports.
     *
     * @return string id
     */
    public Integer getRequirementId()
    {
        return requirementId;
    }


    /**
     * Set up the identifier of the profile's requirement that this test evidence supports.
     *
     * @param requirementId string id
     */
    public void setRequirementId(Integer requirementId)
    {
        this.requirementId = requirementId;
    }


    /**
     * Return the identifier of the test case that produced this test evidence.
     *
     * @return string id
     */
    public String getTestCaseId()
    {
        return testCaseId;
    }


    /**
     * Set up the identifier of the test case that produced this test evidence.
     *
     * @param testCaseId string id
     */
    public void setTestCaseId(String testCaseId)
    {
        this.testCaseId = testCaseId;
    }


    /**
     * Return the name of the test case that produced this test evidence.
     *
     * @return string name
     */
    public String getTestCaseName()
    {
        return testCaseName;
    }


    /**
     * Set up the name of the test case that produced this test evidence.
     *
     * @param testCaseName string name
     */
    public void setTestCaseName(String testCaseName)
    {
        this.testCaseName = testCaseName;
    }


    /**
     * Return the url for the documentation of the test case that produced this test evidence.
     *
     * @return url
     */
    public String getTestCaseDescriptionURL()
    {
        return testCaseDescriptionURL;
    }


    /**
     * Set up the url for the documentation of the test case that produced this test evidence.
     *
     * @param testCaseDescriptionURL url
     */
    public void setTestCaseDescriptionURL(String testCaseDescriptionURL)
    {
        this.testCaseDescriptionURL = testCaseDescriptionURL;
    }


    /**
     * Return the enum that describes the type of test evidence that this represents.
     *
     * @return enum
     */
    public OpenMetadataConformanceTestEvidenceType getTestEvidenceType()
    {
        return testEvidenceType;
    }


    /**
     * Set up the enum that describes the type of test evidence that this represents.
     *
     * @param testEvidenceType enum
     */
    public void setTestEvidenceType(OpenMetadataConformanceTestEvidenceType testEvidenceType)
    {
        this.testEvidenceType = testEvidenceType;
    }


    /**
     * Return details of an unexpected exception that interrupted the test.
     *
     * @return exception bean
     */
    public ExceptionBean getConformanceException()
    {
        return conformanceException;
    }


    /**
     * Set up details of an unexpected exception that interrupted the test.
     *
     * @param conformanceException bean with exception properties
     */
    public void setConformanceException(ExceptionBean conformanceException)
    {
        this.conformanceException = conformanceException;
    }


    /**
     * Return the name of a discovered property.
     *
     * @return string name
     */
    public String getPropertyName()
    {
        return propertyName;
    }


    /**
     * Set up the name of a discovered property.
     *
     * @param propertyName string name
     */
    public void setPropertyName(String propertyName)
    {
        this.propertyName = propertyName;
    }


    /**
     * Return the value of a discovered property.
     *
     * @return object
     */
    public Object getPropertyValue()
    {
        return propertyValue;
    }


    /**
     * Set up the value of a discovered property.
     *
     * @param propertyValue object
     */
    public void setPropertyValue(Object propertyValue)
    {
        this.propertyValue = propertyValue;
    }


    /**
     * toString() JSON-style
     *
     * @return string description
     */
    @Override
    public String toString()
    {
        return "OpenMetadataConformanceTestEvidence{" +
                "profileId=" + profileId +
                ", requirementId=" + requirementId +
                ", testCaseId='" + testCaseId + '\'' +
                ", testCaseName='" + testCaseName + '\'' +
                ", testCaseDescriptionURL='" + testCaseDescriptionURL + '\'' +
                ", testEvidenceType=" + testEvidenceType +
                ", assertionMessage='" + assertionMessage + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", propertyValue=" + propertyValue +
                ", conformanceException=" + conformanceException +
                '}';
    }
}