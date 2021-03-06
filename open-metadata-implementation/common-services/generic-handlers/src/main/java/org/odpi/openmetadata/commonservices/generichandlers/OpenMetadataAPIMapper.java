/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.commonservices.generichandlers;

/**
 * OpenMetadataAPIMapper provides property name mapping for the generic builder, handler and converter.
 * It includes identifiers for all of the types that need specialist processing at this level in the stack
 */
public class OpenMetadataAPIMapper
{
    /* ============================================================================================================================*/
    /* Area 0 - Basic definitions and Infrastructure                                                                               */
    /* ============================================================================================================================*/

    public static final String REFERENCEABLE_TYPE_GUID                   = "a32316b8-dc8c-48c5-b12b-71c1b2a080bf";
    public static final String REFERENCEABLE_TYPE_NAME                   = "Referenceable";          /* from Area 0 */

    public static final String QUALIFIED_NAME_PROPERTY_NAME              = "qualifiedName";                        /* from Referenceable entity */
    public static final String ADDITIONAL_PROPERTIES_PROPERTY_NAME       = "additionalProperties";                 /* from Referenceable entity */

    public static final String ASSET_TYPE_GUID                           = "896d14c2-7522-4f6c-8519-757711943fe6";
    public static final String ASSET_TYPE_NAME                           = "Asset";
    /* Referenceable */


    public static final String DATA_SET_TYPE_GUID                        = "1449911c-4f44-4c22-abc0-7540154feefb";  /* from Area 0 */
    public static final String DATA_SET_TYPE_NAME                        = "DataSet";
    /* Asset */

    public static final String NAME_PROPERTY_NAME = "name";                                 /* from Asset entity */

    public static final String LOCATION_TYPE_GUID            = "3e09cb2b-5f15-4fd2-b004-fe0146ad8628";
    public static final String LOCATION_TYPE_NAME            = "Location";
    /* Referenceable */

    public static final String ASSET_LOCATION_TYPE_GUID                  = "bc236b62-d0e6-4c5c-93a1-3a35c3dba7b1";  /* from Area 0 */
    public static final String ASSET_LOCATION_TYPE_NAME                  = "AssetLocation";
    /* End1 = Location; End 2 = Asset */

    public static final String IS_PUBLIC_PROPERTY_NAME                   = "isPublic";   /* from feedback relationships - Area 1 */
    public static final String DISPLAY_NAME_PROPERTY_NAME                = "displayName";         /* from many entities */
    public static final String DESCRIPTION_PROPERTY_NAME                 = "description";                          /* from Asset entity */



    public static final String ANCHORS_CLASSIFICATION_TYPE_GUID                  = "aa44f302-2e43-4669-a1e7-edaae414fc6e";
    public static final String ANCHORS_CLASSIFICATION_TYPE_NAME                  = "Anchors";
    public static final String ANCHOR_GUID_PROPERTY_NAME                         = "anchorGUID";

    public static final String LATEST_CHANGE_TARGET_ENUM_TYPE_GUID               = "a0b7d7a0-4af5-4539-9b81-cbef52d8cc5d";
    public static final String LATEST_CHANGE_TARGET_ENUM_TYPE_NAME               = "LatestChangeTarget";
    public static final int    ENTITY_STATUS_LATEST_CHANGE_TARGET_ORDINAL             = 0;
    public static final int    ENTITY_PROPERTY_LATEST_CHANGE_TARGET_ORDINAL           = 1;
    public static final int    ENTITY_CLASSIFICATION_LATEST_CHANGE_TARGET_ORDINAL     = 2;
    public static final int    ENTITY_RELATIONSHIP_LATEST_CHANGE_TARGET_ORDINAL       = 3;
    public static final int    ATTACHMENT_LATEST_CHANGE_TARGET_ORDINAL                = 4;
    public static final int    ATTACHMENT_STATUS_LATEST_CHANGE_TARGET_ORDINAL         = 5;
    public static final int    ATTACHMENT_PROPERTY_LATEST_CHANGE_TARGET_ORDINAL       = 6;
    public static final int    ATTACHMENT_CLASSIFICATION_LATEST_CHANGE_TARGET_ORDINAL = 7;
    public static final int    ATTACHMENT_RELATIONSHIP_LATEST_CHANGE_TARGET_ORDINAL   = 8;
    public static final int    OTHER_LATEST_CHANGE_TARGET_ORDINAL                     = 99;

    public static final String LATEST_CHANGE_ACTION_ENUM_TYPE_GUID               = "032d844b-868f-4c4a-bc5d-81f0f9704c4d";
    public static final String LATEST_CHANGE_ACTION_ENUM_TYPE_NAME               = "LatestChangeAction";
    public static final int    CREATED_LATEST_CHANGE_ACTION_ORDINAL                   = 0;
    public static final int    UPDATED_LATEST_CHANGE_ACTION_ORDINAL                   = 1;
    public static final int    DELETED_LATEST_CHANGE_ACTION_ORDINAL                   = 2;
    public static final int    OTHER_LATEST_CHANGE_ACTION_ORDINAL                     = 99;

    public static final String LATEST_CHANGE_CLASSIFICATION_TYPE_GUID            = "adce83ac-10f1-4279-8a35-346976e94466";
    public static final String LATEST_CHANGE_CLASSIFICATION_TYPE_NAME            = "LatestChange";
    public static final String CHANGE_TARGET_PROPERTY_NAME                       = "changeTarget";
    public static final String CHANGE_ACTION_PROPERTY_NAME                       = "changeAction";
    public static final String CLASSIFICATION_NAME_PROPERTY_NAME                 = "classificationName";
    public static final String ATTACHMENT_GUID_PROPERTY_NAME                     = "attachmentGUID";
    public static final String ATTACHMENT_TYPE_PROPERTY_NAME                     = "attachmentType";
    public static final String RELATIONSHIP_TYPE_PROPERTY_NAME                   = "relationshipType";
    public static final String USER_PROPERTY_NAME                                = "user";
    public static final String ACTION_DESCRIPTION_PROPERTY_NAME                  = "description";

    public static final String TEMPLATE_CLASSIFICATION_TYPE_GUID                 = "25fad4a2-c2d6-440d-a5b1-e537881f84ee";
    public static final String TEMPLATE_CLASSIFICATION_TYPE_NAME                 = "Template";
    public static final String TEMPLATE_NAME_PROPERTY_NAME                       = "name";
    public static final String TEMPLATE_DESCRIPTION_PROPERTY_NAME                = "description";
    public static final String TEMPLATE_ADDITIONAL_PROPERTIES_PROPERTY_NAME      = "additionalProperties";

    public static final String SOURCED_FROM_RELATIONSHIP_TYPE_GUID  = "87b7371e-e311-460f-8849-08646d0d6ad3";   /* from Area 0 */
    public static final String SOURCED_FROM_RELATIONSHIP_TYPE_NAME  = "SourcedFrom";
    /* End1 = NewEntity; End 2 = Template */


    public static final String REFERENCEABLE_TO_MORE_INFO_TYPE_GUID              = "1cbf059e-2c11-4e0c-8aae-1da42c1ee73f";
    public static final String REFERENCEABLE_TO_MORE_INFO_TYPE_NAME              = "MoreInformation";
    /* End1 = Referenceable; End 2 = more info Referenceable */


    public static final String SEARCH_KEYWORD_TYPE_GUID                          = "0134c9ae-0fe6-4224-bb3b-e18b78a90b1e";
    public static final String SEARCH_KEYWORD_TYPE_NAME                          = "SearchKeyword";
    public static final String KEYWORD_PROPERTY_NAME                             = "keyword";
    public static final String KEYWORD_DESCRIPTION_PROPERTY_NAME                 = "description";

    public static final String REFERENCEABLE_TO_SEARCH_KEYWORD_TYPE_GUID         = "111e6d2e-94e9-43ed-b4ed-f0d220668cbf";
    public static final String REFERENCEABLE_TO_SEARCH_KEYWORD_TYPE_NAME         = "SearchKeywordLink";
    /* End1 = Referenceable; End 2 = SearchKeyword */

    public static final String SEARCH_KEYWORD_TO_RELATED_KEYWORD_TYPE_GUID       = "f9ffa8a8-80f5-4e6d-9c05-a3a5e0277d62";
    public static final String SEARCH_KEYWORD_TO_RELATED_KEYWORD_TYPE_NAME       = "RelatedKeyword";
    /* End1 = SearchKeyword; End 2 = SearchKeyword */

    public static final String EXTERNAL_IDENTIFIER_TYPE_GUID             = "7c8f8c2c-cc48-429e-8a21-a1f1851ccdb0";
    public static final String EXTERNAL_IDENTIFIER_TYPE_NAME             = "ExternalId";              /* from Area 0 */

    public static final String IDENTIFIER_PROPERTY_NAME                  = "identifier";              /* from ExternalId entity */
    public static final String KEY_PATTERN_PROPERTY_NAME                 = "keyPattern";              /* from External entity */
    /* Enum type KeyPattern */

    public static final String KEY_PATTERN_ENUM_TYPE_GUID  = "8904df8f-1aca-4de8-9abd-1ef2aadba300";
    public static final String KEY_PATTERN_ENUM_TYPE_NAME  = "KeyPattern";

    public static final String REFERENCEABLE_TO_EXTERNAL_ID_TYPE_GUID    = "28ab0381-c662-4b6d-b787-5d77208de126";
    public static final String REFERENCEABLE_TO_EXTERNAL_ID_TYPE_NAME    = "ExternalIdLink";
    /* End1 = Referenceable; End 2 = ExternalId */

    public static final String EXTERNAL_ID_SCOPE_TYPE_GUID               = "8c5b1415-2d1f-4190-ba6c-1fdd47f03269";
    public static final String EXTERNAL_ID_SCOPE_TYPE_NAME               = "ExternalIdScope";
    /* End1 = Referenceable; End 2 = ExternalId */

    public static final String EXTERNAL_ID_DESCRIPTION_PROPERTY_NAME     = "description"; /* from ExternalIdLink and ExternalIdScope relationships */
    public static final String EXTERNAL_ID_USAGE_PROPERTY_NAME           = "usage";                    /* from ExternalIdLink relationship */
    public static final String EXTERNAL_ID_SOURCE_PROPERTY_NAME          = "source";                   /* from ExternalIdLink relationship */

    public static final String REFERENCEABLE_TO_EXT_REF_TYPE_GUID                = "7d818a67-ab45-481c-bc28-f6b1caf12f06";
    public static final String REFERENCEABLE_TO_EXT_REF_TYPE_NAME                = "ExternalReferenceLink";
    /* End1 = Referenceable; End 2 = ExternalReference */

    public static final String EXTERNAL_REFERENCE_TYPE_GUID           = "af536f20-062b-48ef-9c31-1ddd05b04c56";
    public static final String EXTERNAL_REFERENCE_TYPE_NAME           = "ExternalReference";    /* from Area 0 */
    /* Referenceable */

    public static final String URL_PROPERTY_NAME                         = "url";                 /* from ExternalReference entity */
    public static final String VERSION_PROPERTY_NAME                     = "referenceVersion";             /* from ExternalReference entity */
    public static final String ORGANIZATION_PROPERTY_NAME                = "organization";        /* from ExternalReference entity */

    public static final String REFERENCE_ID_PROPERTY_NAME                = "referenceId";          /* from ExternalReferenceLink relationship */
    /* also description property */

    public static final String RELATED_MEDIA_TYPE_GUID                   = "747f8b86-fe7c-4c9b-ba75-979e093cc307";
    public static final String RELATED_MEDIA_TYPE_NAME                   = "RelatedMedia";         /* from Area 0 */
    /* ExternalReference */

    public static final String MEDIA_USAGE_PROPERTY_NAME                 = "mediaUsage";           /* from RelatedMedia entity */
    public static final String MEDIA_TYPE_PROPERTY_NAME                  = "mediaType";            /* from RelatedMedia entity */
    /* MediaType enum */

    public static final String REFERENCEABLE_TO_RELATED_MEDIA_TYPE_GUID  = "1353400f-b0ab-4ab9-ab09-3045dd8a7140";
    public static final String REFERENCEABLE_TO_RELATED_MEDIA_TYPE_NAME  = "MediaReference";
    /* End1 = Referenceable; End 2 = RelatedMedia */

    public static final String MEDIA_ID_PROPERTY_NAME                    = "mediaId";              /* from MediaReference relationship */
    public static final String MEDIA_DESCRIPTION_PROPERTY_NAME           = "description";          /* from MediaReference relationship */

    public static final String SOFTWARE_SERVER_TYPE_GUID                 = "896d14c2-7522-4f6c-8519-757711943fe6";
    public static final String SOFTWARE_SERVER_TYPE_NAME                 = "SoftwareServer";
    /* ITInfrastructure */

    public static final String SERVER_TYPE_PROPERTY_NAME            = "deployedImplementationType";      /* from SoftwareServer entity */
    public static final String SERVER_VERSION_PROPERTY_NAME         = "serverVersion";   /* from SoftwareServer entity */
    public static final String SERVER_SOURCE_PROPERTY_NAME          = "source";    /* from SoftwareServer entity */
    public static final String SERVER_USER_ID_PROPERTY_NAME         = "userId";    /* from SoftwareServer entity */


    public static final String SERVER_ENDPOINT_TYPE_GUID     = "2b8bfab4-8023-4611-9833-82a0dc95f187";
    public static final String SERVER_ENDPOINT_TYPE_NAME     = "ServerEndpoint";
    /* End 1 = SoftwareServer; End 2 = Endpoint */

    public static final String SERVER_DEPLOYMENT_TYPE_GUID   = "d909eb3b-5205-4180-9f63-122a65b30738";
    public static final String SERVER_DEPLOYMENT_TYPE_NAME   = "SoftwareServerDeployment";
    /* End 1 = SoftwareServerPlatform; End 2 = SoftwareServer */

    public static final String DEPLOYMENT_TIME_PROPERTY_NAME          = "deploymentTime";          /* from SoftwareServerDeployment */
    public static final String DEPLOYER_PROPERTY_NAME                 = "deployer";                /* from SoftwareServerDeployment */
    public static final String SERVER_CAPABILITY_STATUS_PROPERTY_NAME = "serverCapabilityStatus";  /* from SoftwareServerDeployment */

    public static final String ENDPOINT_TYPE_GUID                        = "dbc20663-d705-4ff0-8424-80c262c6b8e7";
    public static final String ENDPOINT_TYPE_NAME                        = "Endpoint";
    /* Referenceable */

    public static final String ENDPOINT_DISPLAY_NAME_PROPERTY_NAME       = "name";                                 /* from Endpoint entity */
    public static final String NETWORK_ADDRESS_PROPERTY_NAME             = "networkAddress";                       /* from Endpoint entity */
    public static final String PROTOCOL_PROPERTY_NAME                    = "protocol";                             /* from Endpoint entity */
    public static final String ENCRYPTION_METHOD_PROPERTY_NAME           = "encryptionMethod";                     /* from Endpoint entity */

    public static final String SOFTWARE_SERVICE_TYPE_GUID = "f3f69251-adb1-4042-9d95-70082f95a028";
    public static final String SOFTWARE_SERVICE_TYPE_NAME = "SoftwareService";
    /* SoftwareServerCapability */

    public static final String METADATA_INTEGRATION_SERVICE_TYPE_GUID = "92f7fe27-cd2f-441c-a084-156821aa5bca8";
    public static final String METADATA_INTEGRATION_SERVICE_TYPE_NAME = "MetadataIntegrationService";
    /* SoftwareService */

    public static final String METADATA_ACCESS_SERVICE_TYPE_GUID = "0bc3a16a-e8ed-4ad0-a302-0773365fdef0";
    public static final String METADATA_ACCESS_SERVICE_TYPE_NAME = "MetadataAccessService";
    /* SoftwareService */

    public static final String ENGINE_HOSTING_SERVICE_TYPE_GUID = "90880f0b-c7a3-4d1d-93cc-0b877f27cd33";
    public static final String ENGINE_HOSTING_SERVICE_TYPE_NAME = "EngineHostingService";
    /* SoftwareService */

    public static final String USER_VIEW_SERVICE_TYPE_GUID = "1f83fc7c-75bb-491d-980d-ff9a6f80ae02";
    public static final String USER_VIEW_SERVICE_TYPE_NAME = "UserViewService";
    /* SoftwareService */

    public static final String NETWORK_GATEWAY_TYPE_GUID             = "9bbae94d-e109-4c96-b072-4f97123f04fd";
    public static final String NETWORK_GATEWAY_TYPE_NAME             = "NetworkGateway";
    /* SoftwareServerCapability */

    public static final String SOFTWARE_SERVER_CAPABILITY_TYPE_GUID   = "fe30a033-8f86-4d17-8986-e6166fa24177";
    public static final String SOFTWARE_SERVER_CAPABILITY_TYPE_NAME   = "SoftwareServerCapability";
    /* Referenceable */

    public static final String CAPABILITY_DISPLAY_NAME_PROPERTY_NAME    = "name";          /* from SoftwareServerCapability entity */
    public static final String CAPABILITY_TYPE_PROPERTY_NAME            = "deployedImplementationType";          /* from SoftwareServerCapability entity */
    public static final String CAPABILITY_TYPE_PROPERTY_NAME_DEP        = "type";          /* from SoftwareServerCapability entity */
    public static final String CAPABILITY_VERSION_PROPERTY_NAME         = "capabilityVersion";       /* from SoftwareServerCapability entity */
    public static final String CAPABILITY_VERSION_PROPERTY_NAME_DEP     = "version";       /* from SoftwareServerCapability entity */
    public static final String CAPABILITY_PATCH_LEVEL_PROPERTY_NAME     = "patchLevel";    /* from SoftwareServerCapability entity */
    public static final String CAPABILITY_SOURCE_PROPERTY_NAME          = "source";        /* from SoftwareServerCapability entity */

    public static final String SUPPORTED_CAPABILITY_TYPE_GUID         = "8b7d7da5-0668-4174-a43b-8f8c6c068dd0";
    public static final String SUPPORTED_CAPABILITY_TYPE_NAME         = "SoftwareServerSupportedCapability";
    /* End 1 = SoftwareServer; End 2 = SoftwareServerCapability */

    public static final String APPLICATION_TYPE_GUID                  = "58280f3c-9d63-4eae-9509-3f223872fb25";
    public static final String APPLICATION_TYPE_NAME                  = "Application";
    /* SoftwareServerCapability */

    public static final String ENGINE_TYPE_GUID                       = "3566527f-b1bd-4e7a-873e-a3e04d5f2a14";
    public static final String ENGINE_TYPE_NAME                       = "Engine";
    /* SoftwareServerCapability */

    public static final String WORKFLOW_ENGINE_CLASSIFICATION_GUID   = "37a6d212-7c4a-4a82-b4e2-601d4358381c";
    public static final String WORKFLOW_ENGINE_CLASSIFICATION_NAME   = "WorkflowEngine";
    /* Engine */

    public static final String REPORTING_ENGINE_CLASSIFICATION_GUID   = "e07eefaa-16e0-46cf-ad54-bed47fb15812";
    public static final String REPORTING_ENGINE_CLASSIFICATION_NAME   = "ReportingEngine";
    /* Engine */

    public static final String ANALYTICS_ENGINE_CLASSIFICATION_GUID   = "1a0dc6f6-7980-42f5-98bd-51e56543a07e";
    public static final String ANALYTICS_ENGINE_CLASSIFICATION_NAME   = "AnalyticsEngine";
    /* Engine */

    public static final String DATA_MOVEMENT_ENGINE_CLASSIFICATION_GUID = "d2ed6621-9d99-4fe8-843a-b28d816cf888";
    public static final String DATA_MOVEMENT_ENGINE_CLASSIFICATION_NAME = "DataMovementEngine";
    /* Engine */

    public static final String DATA_VIRTUALIZATION_ENGINE_CLASSIFICATION_GUID = "03e25cd0-03d7-4d96-b28b-eed671824ed6";
    public static final String DATA_VIRTUALIZATION_ENGINE_CLASSIFICATION_NAME = "DataVirtualizationEngine";
    /* Engine */


    public static final String SERVER_ASSET_USE_TYPE_GUID                = "92b75926-8e9a-46c7-9d98-89009f622397";  /* from Area 0 */
    public static final String SERVER_ASSET_USE_TYPE_NAME                = "ServerAssetUse";
    /* End1 = SoftwareServerCapability; End 2 = Asset */


    public static final String USE_TYPE_PROPERTY_NAME                    = "useType";                         /* from ServerAssetUse relationship */
    /* public static final String DESCRIPTION_PROPERTY_NAME              = "description";                        from ServerAssetUse relationship */


    public static final String CLOUD_SERVICE_CLASSIFICATION_GUID     = "337e7b1a-ad4b-4818-aa3e-0ff3307b2fbe6";
    public static final String CLOUD_SERVICE_CLASSIFICATION_NAME     = "CloudService";
    /* SoftwareServerCapability */

    public static final String OFFERING_NAME_PROPERTY_NAME           = "offeringName";          /* from CloudService */
    public static final String SERVICE_TYPE_PROPERTY_NAME            = "serviceType";                  /* from CloudService */

    /* ============================================================================================================================*/
    /* Area 1 - Collaboration                                                                                                      */
    /* ============================================================================================================================*/

    public static final String PERSONAL_PROFILE_TYPE_GUID                = "ac406bf8-e53e-49f1-9088-2af28bbbd285";
    public static final String PERSONAL_PROFILE_TYPE_NAME                = "Person";                 /* from Area 1 */
    /* Actor */

    public static final String PERSONAL_CONTRIBUTION_RELATIONSHIP_TYPE_GUID  = "4a316abe-eeee-4d11-ad5a-4bfb4079b80b";   /* from Area 5 */
    public static final String PERSONAL_CONTRIBUTION_RELATIONSHIP_TYPE_NAME  = "PersonalContribution";
    /* End1 = Person; End 2 = ContributionRecord */

    public static final String CONTRIBUTION_RECORD_TYPE_GUID             = "ac406bf8-e53e-49f1-9088-2af28cccd285";
    public static final String CONTRIBUTION_RECORD_TYPE_NAME             = "ContributionRecord";                 /* from Area 1 */
    /* Referenceable */

    public static final String INFORMAL_TAG_TYPE_GUID                    = "ba846a7b-2955-40bf-952b-2793ceca090a";
    public static final String INFORMAL_TAG_TYPE_NAME                    = "InformalTag";          /* from Area 1 */

    public static final String TAG_IS_PUBLIC_PROPERTY_NAME               = "isPublic"; /* from InformalTag entity and AttachedTag relationship */
    public static final String TAG_NAME_PROPERTY_NAME                    = "tagName";              /* from InformalTag entity */
    public static final String TAG_DESCRIPTION_PROPERTY_NAME             = "tagDescription";       /* from InformalTag entity */
    public static final String TAG_USER_PROPERTY_NAME                    = "createdBy";            /* From Audit Header */

    public static final String REFERENCEABLE_TO_TAG_TYPE_GUID            = "4b1641c4-3d1a-4213-86b2-d6968b6c65ab";
    public static final String REFERENCEABLE_TO_TAG_TYPE_NAME            = "AttachedTag";
    /* End1 = Referenceable; End 2 = InformalTag */
    /* Also isPublic */

    public static final String LIKE_TYPE_GUID                            = "deaa5ca0-47a0-483d-b943-d91c76744e01";
    public static final String LIKE_TYPE_NAME                            = "Like";          /* from Area 1 */

    public static final String REFERENCEABLE_TO_LIKE_TYPE_GUID                   = "e2509715-a606-415d-a995-61d00503dad4";
    public static final String REFERENCEABLE_TO_LIKE_TYPE_NAME                   = "AttachedLike";
    /* End1 = Referenceable; End 2 = Like */

    public static final String LIKE_IS_PUBLIC_PROPERTY_NAME              = "isPublic";      /* from AttachedLike relationship*/

    public static final String RATING_TYPE_GUID                          = "7299d721-d17f-4562-8286-bcd451814478";
    public static final String RATING_TYPE_NAME                          = "Rating";          /* from Area 1 */

    public static final String STAR_RATING_ENUM_TYPE_GUID                = "77fea3ef-6ec1-4223-8408-38567e9d3c93";
    public static final String STAR_RATING_ENUM_TYPE_NAME                = "StarRating";              /* from Area 1 */

    public static final String STARS_PROPERTY_NAME                       = "stars";           /* from Rating entity */
    /* StarRating enum */
    public static final String REVIEW_PROPERTY_NAME                      = "review";          /* from Rating entity */

    public static final String REFERENCEABLE_TO_RATING_TYPE_GUID         = "0aaad9e9-9cc5-4ad8-bc2e-c1099bab6344";
    public static final String REFERENCEABLE_TO_RATING_TYPE_NAME         = "AttachedRating";
    /* End1 = Referenceable; End 2 = Rating */

    public static final String RATING_IS_PUBLIC_PROPERTY_NAME            = "isPublic";        /* from AttachedRating relationship */

    public static final String COMMENT_TYPE_GUID                         = "1a226073-9c84-40e4-a422-fbddb9b84278";
    public static final String COMMENT_TYPE_NAME                         = "Comment";              /* from Area 1 */
    /* Referenceable */

    public static final String COMMENT_TEXT_PROPERTY_NAME                = "text";          /* from Comment entity */
    public static final String COMMENT_TYPE_PROPERTY_NAME                = "commentType";   /* from Comment entity */
    public static final String COMMENT_TYPE_PROPERTY_NAME_DEP            = "type";          /* from Comment entity */

    public static final String COMMENT_TYPE_ENUM_TYPE_GUID               = "06d5032e-192a-4f77-ade1-a4b97926e867";
    public static final String COMMENT_TYPE_ENUM_TYPE_NAME               = "CommentType";              /* from Area 1 */

    public static final String REFERENCEABLE_TO_COMMENT_TYPE_GUID        = "0d90501b-bf29-4621-a207-0c8c953bdac9";
    public static final String REFERENCEABLE_TO_COMMENT_TYPE_NAME        = "AttachedComment";
    /* End1 = Referenceable; End 2 = Comment */

    public static final String ANSWER_RELATIONSHIP_TYPE_GUID             = "ecf1a3ca-adc5-4747-82cf-10ec590c5c69";
    public static final String ANSWER_RELATIONSHIP_TYPE_NAME             = "AcceptedAnswer";
    /* End1 = Comment; End 2 = Comment */

    public static final String COMMENT_IS_PUBLIC_PROPERTY_NAME           = "isPublic";   /* from AttachedComment and AcceptedAnswer
    relationships */

    public static final String COLLECTION_TYPE_GUID                      = "347005ba-2b35-4670-b5a7-12c9ebed0cf7";
    public static final String COLLECTION_TYPE_NAME                      = "Collection";              /* from Area 1 */
    /* Referenceable */
    public static final String COLLECTION_DISPLAY_NAME_PROPERTY_NAME     = "name";                    /* from Collection entity */


    public static final String REFERENCEABLE_TO_COLLECTION_TYPE_GUID     = "5cabb76a-e25b-4bb5-8b93-768bbac005af";
    public static final String REFERENCEABLE_TO_COLLECTION_TYPE_NAME     = "CollectionMembership";
    /* End1 = Collection; End 2 = Referenceable */
    public static final String MEMBERSHIP_RATIONALE_PROPERTY_NAME       = "membershipRationale";


    public static final String REFERENCEABLE_TO_NOTE_LOG_TYPE_GUID      = "4f798c0c-6769-4a2d-b489-d2714d89e0a4";
    public static final String REFERENCEABLE_TO_NOTE_LOG_TYPE_NAME      = "AttachedNoteLog";
    /* End1 = Referenceable; End 2 = NoteLog */
    /* And isPublicProperty */

    public static final String NOTE_LOG_TYPE_GUID                       = "646727c7-9ad4-46fa-b660-265489ad96c6";
    public static final String NOTE_LOG_TYPE_NAME                       = "NoteLog";              /* from Area 1 */
    /* Referenceable */
    public static final String NOTE_LOG_NAME_PROPERTY_NAME              = "name";                 /* from NoteLog entity */

    public static final String NOTE_LOG_ENTRIES_RELATIONSHIP_TYPE_GUID  = "38edecc6-f385-4574-8144-524a44e3e712";
    public static final String NOTE_LOG_ENTRIES_RELATIONSHIP_TYPE_NAME  = "AttachedNoteLogEntry";
    /* End1 = NoteLog; End 2 = NoteEntry */

    public static final String NOTE_ENTRY_TYPE_GUID                     = "2a84d94c-ac6f-4be1-a72a-07dcec7b1fe3";
    public static final String NOTE_ENTRY_TYPE_NAME                     = "NoteEntry";              /* from Area 1 */
    /* Referenceable */

    public static final String NOTE_ENTRY_TITLE_PROPERTY_NAME           = "title";                /* from NoteEntry entity */
    public static final String NOTE_ENTRY_TEXT_PROPERTY_NAME            = "text";                 /* from NoteEntry entity */
    /* And isPublicProperty */

    public static final String NOTE_LOG_AUTHOR_RELATIONSHIP_TYPE_GUID  = "8f798c0c-6769-4a2d-b489-12714d89e0a4";
    public static final String NOTE_LOG_AUTHOR_RELATIONSHIP_TYPE_NAME  = "NoteLogAuthorship";
    /* End1 = NoteLogAuthor; End 2 = NoteLog */

    public static final String NOTE_LOG_AUTHOR_TYPE_GUID                = "3a84d94c-ac6f-4be1-a72a-07dbec7b1fe3";
    public static final String NOTE_LOG_AUTHOR_TYPE_NAME                = "NoteLogAuthor";              /* from Area 1 */
    /* PersonRole */

    public static final String NOTE_TYPE_GUID                           = "646727c7-9ad4-46fa-b660-265489ad96c6";
    public static final String NOTE_TYPE_NAME                            = "NoteEntry";              /* from Area 1 */
    /* Referenceable */

    /* ============================================================================================================================*/
    /* Area 2 - Assets                                                                                                             */
    /* ============================================================================================================================*/

    public static final String CONNECTION_TYPE_GUID                      = "114e9f8f-5ff3-4c32-bd37-a7eb42712253";
    public static final String CONNECTION_TYPE_NAME                      = "Connection";
    /* Referenceable */

    public static final String SECURED_PROPERTIES_PROPERTY_NAME          = "securedProperties";                    /* from Connection entity */
    public static final String CONFIGURATION_PROPERTIES_PROPERTY_NAME    = "configurationProperties";              /* from Connection entity */
    public static final String USER_ID_PROPERTY_NAME                     = "userId";                               /* from Connection entity */
    public static final String CLEAR_PASSWORD_PROPERTY_NAME              = "clearPassword";                        /* from Connection entity */
    public static final String ENCRYPTED_PASSWORD_PROPERTY_NAME          = "encryptedPassword";                    /* from Connection entity */

    public static final String CONNECTION_ENDPOINT_TYPE_GUID             = "887a7132-d6bc-4b92-a483-e80b60c86fb2";
    public static final String CONNECTION_ENDPOINT_TYPE_NAME             = "ConnectionEndpoint";
    /* End1 = Endpoint; End 2 = Connection */

    public static final String CONNECTION_CONNECTOR_TYPE_TYPE_GUID       = "e542cfc1-0b4b-42b9-9921-f0a5a88aaf96";
    public static final String CONNECTION_CONNECTOR_TYPE_TYPE_NAME       = "ConnectionConnectorType";
    /* End1 = Connection; End 2 = ConnectorType */

    public static final String CONNECTOR_TYPE_TYPE_GUID                  = "954421eb-33a6-462d-a8ca-b5709a1bd0d4";
    public static final String CONNECTOR_TYPE_TYPE_NAME                  = "ConnectorType";
    /* Referenceable */

    public static final String CONNECTOR_PROVIDER_PROPERTY_NAME          = "connectorProviderClassName";           /* from ConnectorType entity */
    public static final String RECOGNIZED_ADD_PROPS_PROPERTY_NAME        = "recognizedAdditionalProperties";       /* from ConnectorType entity */
    public static final String RECOGNIZED_SEC_PROPS_PROPERTY_NAME        = "recognizedSecuredProperties";          /* from ConnectorType entity */
    public static final String RECOGNIZED_CONFIG_PROPS_PROPERTY_NAME     = "recognizedConfigurationProperties";    /* from ConnectorType entity */

    public static final String VIRTUAL_CONNECTION_TYPE_GUID              = "82f9c664-e59d-484c-a8f3-17088c23a2f3";
    public static final String VIRTUAL_CONNECTION_TYPE_NAME              = "VirtualConnection";

    public static final String EMBEDDED_CONNECTION_TYPE_GUID             = "eb6dfdd2-8c6f-4f0d-a17d-f6ce4799f64f";
    public static final String EMBEDDED_CONNECTION_TYPE_NAME             = "EmbeddedConnection";
    /* End1 = VirtualConnection; End 2 = Connection */

    public static final String POSITION_PROPERTY_NAME                    = "position";              /* from EmbeddedConnection relationship */
    public static final String ARGUMENTS_PROPERTY_NAME                   = "arguments";             /* from EmbeddedConnection relationship */

    public static final String ASSET_TO_CONNECTION_TYPE_GUID             = "e777d660-8dbe-453e-8b83-903771f054c0";
    public static final String ASSET_TO_CONNECTION_TYPE_NAME             = "ConnectionToAsset";
    /* End1 = Connection; End 2 = Asset */

    public static final String ASSET_SUMMARY_PROPERTY_NAME               = "assetSummary";          /* from ConnectionToAsset relationship */


    public static final String DATA_STORE_TYPE_GUID                      = "10752b4a-4b5d-4519-9eae-fdd6d162122f";  /* from Area 2 */
    public static final String DATA_STORE_TYPE_NAME                      = "DataStore";
    /* Asset */

    public static final String CREATE_TIME_PROPERTY_NAME                 = "storeCreateTime";                       /* from DataStore entity */
    public static final String CREATE_TIME_PROPERTY_NAME_DEP             = "createTime";                            /* from DataStore entity */
    public static final String MODIFIED_TIME_PROPERTY_NAME               = "storeUpdateTime";                       /* from DataStore entity */
    public static final String MODIFIED_TIME_PROPERTY_NAME_DEP           = "modifiedTime";                          /* from DataStore entity */

    public static final String DATA_STORE_ENCODING_CLASSIFICATION_GUID   = "f08e48b5-6b66-40f5-8ff6-c2bfe527330b";
    public static final String DATA_STORE_ENCODING_CLASSIFICATION_NAME   = "DataStoreEncoding";

    public static final String ENCODING_TYPE_PROPERTY_NAME               = "encoding";      /* from DataStoreEncoding classification */
    public static final String ENCODING_LANGUAGE_PROPERTY_NAME           = "language";      /* from DataStoreEncoding classification */
    public static final String ENCODING_DESCRIPTION_PROPERTY_NAME        = "description";   /* from DataStoreEncoding classification */
    public static final String ENCODING_PROPERTIES_PROPERTY_NAME         = "properties";    /* from DataStoreEncoding classification */

    public static final String DATABASE_TYPE_GUID                        = "0921c83f-b2db-4086-a52c-0d10e52ca078";  /* from Area 2 */
    public static final String DATABASE_TYPE_NAME                        = "Database";
    /* DataStore */

    public static final String DATABASE_TYPE_PROPERTY_NAME               = "deployedImplementationType";          /* from Database entity */
    public static final String DATABASE_TYPE_PROPERTY_NAME_DEP           = "type";          /* from Database entity */
    public static final String DATABASE_VERSION_PROPERTY_NAME            = "databaseVersion";       /* from Database entity */
    public static final String DATABASE_VERSION_PROPERTY_NAME_DEP        = "version";       /* from Database entity */
    public static final String DATABASE_INSTANCE_PROPERTY_NAME           = "instance";      /* from Database entity */
    public static final String DATABASE_IMPORTED_FROM_PROPERTY_NAME      = "importedFrom";  /* from Database entity */

    public static final String FILE_FOLDER_TYPE_GUID                     = "229ed5cc-de31-45fc-beb4-9919fd247398";  /* from Area 2 */
    public static final String FILE_FOLDER_TYPE_NAME                     = "FileFolder";
    /* DataStore */

    public static final String DATA_FOLDER_TYPE_GUID                     = "9f1fb984-db15-43ee-85fb-f8b0353bfb8b";  /* from Area 2 */
    public static final String DATA_FOLDER_TYPE_NAME                     = "DataFolder";
    /* FileFolder */

    public static final String FOLDER_HIERARCHY_TYPE_GUID                = "48ac9028-45dd-495d-b3e1-622685b54a01";  /* from Area 2 */
    public static final String FOLDER_HIERARCHY_TYPE_NAME                = "FolderHierarchy";

    public static final String NESTED_FILE_TYPE_GUID                     = "4cb88900-1446-4eb6-acea-29cd9da45e63";  /* from Area 2 */
    public static final String NESTED_FILE_TYPE_NAME                     = "NestedFile";

    public static final String LINKED_FILE_TYPE_GUID                     = "970a3405-fde1-4039-8249-9aa5f56d5151";  /* from Area 2 */
    public static final String LINKED_FILE_TYPE_NAME                     = "LinkedFile";

    public static final String DATA_FILE_TYPE_GUID                       = "10752b4a-4b5d-4519-9eae-fdd6d162122f";  /* from Area 2 */
    public static final String DATA_FILE_TYPE_NAME                       = "DataFile";
    /* DataStore */

    public static final String FILE_TYPE_PROPERTY_NAME                   = "fileType";                   /* from DataFile entity */

    public static final String MEDIA_FILE_TYPE_GUID                      = "c5ce5499-9582-42ea-936c-9771fbd475f8";  /* from Area 2 */
    public static final String MEDIA_FILE_TYPE_NAME                      = "MediaFile";
    /* DataFile */
    public static final String DOCUMENT_TYPE_GUID                        = "b463827c-c0a0-4cfb-a2b2-ddc63746ded4";  /* from Area 2 */
    public static final String DOCUMENT_TYPE_NAME                        = "Document";
    /* MediaFile */
    public static final String DOCUMENT_STORE_TYPE_GUID                  = "37156790-feac-4e1a-a42e-88858ae6f8e1";  /* from Area 2 */
    public static final String DOCUMENT_STORE_TYPE_NAME                  = "DocumentStore";
    /* DataStore */
    public static final String MEDIA_COLLECTION_TYPE_GUID                = "0075d603-1627-41c5-8cae-f5458d1247fe";  /* from Area 2 */
    public static final String MEDIA_COLLECTION_TYPE_NAME                = "MediaCollection";
    /* DataSet */

    public static final String LINKED_MEDIA_TYPE_GUID                    = "cee3a190-fc8d-4e53-908a-f1b9689581e0";  /* from Area 2 */
    public static final String LINKED_MEDIA_TYPE_NAME                    = "LinkedMedia";
    /* End1 = MediaFile; End 2 = MediaFile */
    public static final String GROUPED_MEDIA_TYPE_GUID                   = "7d881574-461d-475c-ab44-077451528cb8";  /* from Area 2 */
    public static final String GROUPED_MEDIA_TYPE_NAME                   = "GroupedMedia";
    /* End1 = MediaCollection; End 2 = MediaFile */

    public static final String EMBEDDED_METADATA_PROPERTY_NAME           = "embeddedMetadata";                      /* from MediaFile entity */

    public static final String AVRO_FILE_TYPE_GUID                       = "75293260-3373-4777-af7d-7274d5c0b9a5";  /* from Area 2 */
    public static final String AVRO_FILE_TYPE_NAME                       = "AvroFile";
    /* DataFile */

    public static final String CSV_FILE_TYPE_GUID                        = "2ccb2117-9cee-47ca-8150-9b3a543adcec";  /* from Area 2 */
    public static final String CSV_FILE_TYPE_NAME                        = "CSVFile";
    /* DataFile */

    public static final String DELIMITER_CHARACTER_PROPERTY_NAME         = "delimiterCharacter";                   /* from CSVFile entity */
    public static final String QUOTE_CHARACTER_PROPERTY_NAME             = "quoteCharacter";                       /* from CSVFile entity */


    public static final String JSON_FILE_TYPE_GUID                       = "baa608fa-510e-42d7-95cd-7c12fa37bb35";  /* from Area 2 */
    public static final String JSON_FILE_TYPE_NAME                       = "JSONFile";
    /* DataFile */

    public static final String DEPLOYED_DATABASE_SCHEMA_TYPE_GUID        = "eab811ec-556a-45f1-9091-bc7ac8face0f";  /* from Area 2 */
    public static final String DEPLOYED_DATABASE_SCHEMA_TYPE_NAME        = "DeployedDatabaseSchema";
    /* DataSet */

    public static final String DATA_CONTENT_FOR_DATA_SET_TYPE_GUID       = "b827683c-2924-4df3-a92d-7be1888e23c0";  /* from Area 2 */
    public static final String DATA_CONTENT_FOR_DATA_SET_TYPE_NAME       = "DataContentForDataSet";
    /* End1 = Asset; End 2 = DataSet */

    public static final String DATABASE_MANAGER_CLASSIFICATION_TYPE_GUID = "68b35c1e-6c28-4ac3-94f9-2c3dbcbb79e9";
    public static final String DATABASE_MANAGER_CLASSIFICATION_TYPE_NAME = "DatabaseManager";
    /* SoftwareServerCapability */


    public static final String FILE_SYSTEM_CLASSIFICATION_TYPE_GUID = "cab5ba1d-cfd3-4fca-857d-c07711fc4157";
    public static final String FILE_SYSTEM_CLASSIFICATION_TYPE_NAME = "FileSystem";
    /* SoftwareServerCapability */

    public static final String FORMAT_PROPERTY_NAME                  = "format";                /* from FileSystem */
    public static final String ENCRYPTION_PROPERTY_NAME              = "encryption";            /* from FileSystem */

    public static final String FILE_MANAGER_CLASSIFICATION_TYPE_GUID = "eadec807-02f0-4d6f-911c-261eddd0c2f5";
    public static final String FILE_MANAGER_CLASSIFICATION_TYPE_NAME = "FileManager";
    /* SoftwareServerCapability */

    public static final String NOTIFICATION_MANAGER_CLASSIFICATION_GUID   = "3e7502a7-396a-4737-a106-378c9c94c1057";
    public static final String NOTIFICATION_MANAGER_CLASSIFICATION_NAME   = "NotificationManager";
    /* SoftwareServerCapability */

    public static final String ENTERPRISE_ACCESS_LAYER_TYPE_GUID     = "39444bf9-638e-4124-a5f9-1b8f3e1b008b";
    public static final String ENTERPRISE_ACCESS_LAYER_TYPE_NAME     = "EnterpriseAccessLayer";
    /* SoftwareServerCapability */

    public static final String TOPIC_ROOT_PROPERTY_NAME              = "topicRoot";            /* from EnterpriseAccessLayer */
    public static final String METADATA_COLLECTION_ID_PROPERTY_NAME  = "accessedMetadataCollectionId"; /* from EnterpriseAccessLayer */

    public static final String COHORT_MEMBER_TYPE_GUID               = "42063797-a78a-4720-9353-52026c75f667";
    public static final String COHORT_MEMBER_TYPE_NAME               = "CohortMember";
    /* SoftwareServerCapability */

    public static final String EVENT_VERSION_PROPERTY_NAME           = "protocolVersion";            /* from CohortMember */

    public static final String DEPLOYED_API_TYPE_GUID                    = "7dbb3e63-138f-49f1-97b4-66313871fc14";  /* from Area 2 */
    public static final String DEPLOYED_API_TYPE_NAME                    = "DeployedAPI";
    /* Asset */
    public static final String API_ENDPOINT_TYPE_GUID                    = "de5b9501-3ad4-4803-a8b2-e311c72a4336";  /* from Area 2 */
    public static final String API_ENDPOINT_TYPE_NAME                    = "APIEndpoint";
    /* End1 = DeployedAPI; End 2 = Endpoint */

    public static final String LOG_FILE_TYPE_GUID                        = "ff4c8484-9127-464a-97fc-99579d5bc429";  /* from Area 2 */
    public static final String LOG_FILE_TYPE_NAME                        = "LogFile";
    /* DataFile */
    public static final String LOG_FILE_TYPE_PROPERTY_NAME               = "deployedImplementationType";                                  /* from LogFile entity */

    public static final String TOPIC_TYPE_GUID                           = "29100f49-338e-4361-b05d-7e4e8e818325";  /* from Area 2 */
    public static final String TOPIC_TYPE_NAME                           = "Topic";
    /* DataSet */
    public static final String TOPIC_TYPE_PROPERTY_NAME                  = "topicType";                             /* from Topic entity */

    public static final String SUBSCRIBER_LIST_TYPE_GUID                 = "69751093-35f9-42b1-944b-ba6251ff513d";  /* from Area 2 */
    public static final String SUBSCRIBER_LIST_TYPE_NAME                 = "SubscriberList";
    /* DataSet */
    public static final String TOPIC_SUBSCRIBERS_TYPE_GUID               = "bc91a28c-afb9-41a7-8eb2-fc8b5271fe9e";  /* from Area 2 */
    public static final String TOPIC_SUBSCRIBERS_TYPE_NAME               = "TopicSubscribers";
    /* End1 = SubscriberList; End 2 = Topic */


    /* ============================================================================================================================*/
    /* Area 3 - Glossary                                                                                                           */
    /* ============================================================================================================================*/

    public static final String GLOSSARY_TYPE_GUID                       = "36f66863-9726-4b41-97ee-714fd0dc6fe4";
    public static final String GLOSSARY_TYPE_NAME                       = "Glossary";               /* from Area 3 */
    /* Referenceable */

    public static final String GLOSSARY_CATEGORY_TYPE_GUID              = "e507485b-9b5a-44c9-8a28-6967f7ff3672";
    public static final String GLOSSARY_CATEGORY_TYPE_NAME              = "GlossaryCategory";       /* from Area 3 */
    /* Referenceable */

    public static final String GLOSSARY_TERM_TYPE_GUID                  = "0db3e6ec-f5ef-4d75-ae38-b7ee6fd6ec0a";
    public static final String GLOSSARY_TERM_TYPE_NAME                  = "GlossaryTerm";           /* from Area 3 */
    /* Referenceable */

    public static final String TERM_SUMMARY_PROPERTY_NAME               = "summary";                 /* from GlossaryTerm entity */
    public static final String TERM_EXAMPLES_PROPERTY_NAME              = "examples";                /* from GlossaryTerm entity */
    public static final String TERM_ABBREVIATION_PROPERTY_NAME          = "abbreviation";            /* from GlossaryTerm entity */
    public static final String TERM_USAGE_PROPERTY_NAME                 = "usage";                   /* from GlossaryTerm entity */

    public static final String REFERENCEABLE_TO_MEANING_TYPE_GUID                = "e6670973-645f-441a-bec7-6f5570345b92";
    public static final String REFERENCEABLE_TO_MEANING_TYPE_NAME                = "SemanticAssignment";
    /* End1 = Referenceable; End 2 = GlossaryTerm */

    public static final String TERM_ASSIGNMENT_STATUS_ENUM_TYPE_GUID             = "c8fe36ac-369f-4799-af75-46b9c1343ab3";
    public static final String TERM_ASSIGNMENT_STATUS_ENUM_TYPE_NAME             = "TermAssignmentStatus";

    public static final String SEMANTIC_ASSIGNMENT_DESCRIPTION_PROPERTY_NAME     = "description";
    public static final String SEMANTIC_ASSIGNMENT_EXPRESSION_PROPERTY_NAME      = "expression";
    public static final String SEMANTIC_ASSIGNMENT_STATUS_PROPERTY_NAME          = "status";
    public static final String SEMANTIC_ASSIGNMENT_CONFIDENCE_PROPERTY_NAME      = "confidence";
    public static final String SEMANTIC_ASSIGNMENT_STEWARD_PROPERTY_NAME         = "steward";
    public static final String SEMANTIC_ASSIGNMENT_SOURCE_PROPERTY_NAME          = "source";
    public static final String SEMANTIC_ASSIGNMENT_CREATED_BY_PROPERTY_NAME      = "createdBy";

    /* ============================================================================================================================*/
    /* Area 4 - Governance                                                                                                         */
    /* ============================================================================================================================*/

    public static final String GOVERNANCE_CLASSIFICATION_STATUS_ENUM_TYPE_GUID   = "cc540586-ac7c-41ba-8cc1-4da694a6a8e4";
    public static final String GOVERNANCE_CLASSIFICATION_STATUS_ENUM_TYPE_NAME   = "GovernanceClassificationStatus";

    public static final String CONFIDENCE_LEVEL_ENUM_TYPE_GUID                   = "ae846797-d88a-4421-ad9a-318bf7c1fe6f";
    public static final String CONFIDENCE_LEVEL_ENUM_TYPE_NAME                   = "ConfidenceLevel";

    public static final String RETENTION_BASIS_ENUM_TYPE_GUID                    = "de79bf78-ecb0-4fd0-978f-ecc2cb4ff6c7";
    public static final String RETENTION_BASIS_ENUM_TYPE_NAME                    = "RetentionBasis";

    public static final String CRITICALITY_LEVEL_ENUM_TYPE_GUID                  = "22bcbf49-83e1-4432-b008-e09a8f842a1e";
    public static final String CRITICALITY_LEVEL_ENUM_TYPE_NAME                  = "CriticalityLevel";

    public static final String CONFIDENTIALITY_CLASSIFICATION_TYPE_GUID          = "742ddb7d-9a4a-4eb5-8ac2-1d69953bd2b6";
    public static final String CONFIDENTIALITY_CLASSIFICATION_TYPE_NAME          = "Confidentiality";

    public static final String CONFIDENCE_CLASSIFICATION_TYPE_GUID               = "25d8f8d5-2998-4983-b9ef-265f58732965";
    public static final String CONFIDENCE_CLASSIFICATION_TYPE_NAME               = "Confidence";

    public static final String CRITICALITY_CLASSIFICATION_TYPE_GUID              = "d46d211a-bd22-40d5-b642-87b4954a167e";
    public static final String CRITICALITY_CLASSIFICATION_TYPE_NAME              = "Criticality";

    public static final String RETENTION_CLASSIFICATION_TYPE_GUID                = "83dbcdf2-9445-45d7-bb24-9fa661726553";
    public static final String RETENTION_CLASSIFICATION_TYPE_NAME                = "Retention";

    public static final String GOVERNANCE_CLASSIFICATION_STATUS_PROPERTY_NAME       = "status";
    public static final String GOVERNANCE_CLASSIFICATION_CONFIDENCE_PROPERTY_NAME   = "confidence";
    public static final String GOVERNANCE_CLASSIFICATION_STEWARD_PROPERTY_NAME      = "steward";
    public static final String GOVERNANCE_CLASSIFICATION_SOURCE_PROPERTY_NAME       = "source";
    public static final String GOVERNANCE_CLASSIFICATION_NOTES_PROPERTY_NAME        = "notes";

    public static final String CONFIDENTIALITY_LEVEL_PROPERTY_NAME                  = "level";
    public static final String CONFIDENCE_LEVEL_PROPERTY_NAME                       = "level";
    public static final String CRITICALITY_LEVEL_PROPERTY_NAME                      = "level";
    public static final String RETENTION_BASIS_PROPERTY_NAME                        = "basis";
    public static final String RETENTION_ASSOCIATED_GUID_PROPERTY_NAME              = "associatedGUID";
    public static final String RETENTION_ARCHIVE_AFTER_PROPERTY_NAME                = "archiveAfter";
    public static final String RETENTION_DELETE_AFTER_PROPERTY_NAME                 = "deleteAfter";


    public static final String ORGANIZATION_TYPE_GUID                         = "50a61105-35be-4ee3-8b99-bdd958ed0685";
    public static final String ORGANIZATION_TYPE_NAME                         = "Organization";              /* from Area 4 */
    /* Team */

    public static final String BUSINESS_CAPABILITY_TYPE_GUID                         = "7cc6bcb2-b573-4719-9412-cf6c3f4bbb15";
    public static final String BUSINESS_CAPABILITY_TYPE_NAME                         = "BusinessCapability";         /* from Area 4 */
    /* Referenceable */

    public static final String GOVERNANCE_DEFINITION_TYPE_GUID           = "578a3500-9ad3-45fe-8ada-e4e9572c37c8";
    public static final String GOVERNANCE_DEFINITION_TYPE_NAME           = "GovernanceDefinition";
    /* Referenceable */

    public static final String DOMAIN_PROPERTY_NAME                      = "domain";                    /* from many governance entities */
    public static final String DOMAIN_IDENTIFIER_PROPERTY_NAME           = "domainIdentifier";          /* from many governance entities */
    public static final String CRITERIA_PROPERTY_NAME                    = "criteria";                  /* from many governance entities */
    public static final String SCOPE_PROPERTY_NAME                       = "scope";                     /* from many governance entities */

    public static final String TITLE_PROPERTY_NAME                       = "title";                     /* from GovernanceDefinition entity */
    public static final String SUMMARY_PROPERTY_NAME                     = "summary";                   /* from GovernanceDefinition entity */
    public static final String PRIORITY_PROPERTY_NAME                    = "priority";                  /* from GovernanceDefinition entity */
    public static final String IMPLICATIONS_PROPERTY_NAME                = "implications";              /* from GovernanceDefinition entity */
    public static final String OUTCOMES_PROPERTY_NAME                    = "outcomes";                  /* from GovernanceDefinition entity */
    public static final String RESULTS_PROPERTY_NAME                     = "results";                   /* from GovernanceDefinition entity */


    public static final String ZONE_TYPE_GUID                           = "290a192b-42a7-449a-935a-269ca62cfdac";
    public static final String ZONE_TYPE_NAME                           = "GovernanceZone";
    /* Referenceable */
    
    public static final String REFERENCEABLE_TO_CERTIFICATION_TYPE_GUID          = "390559eb-6a0c-4dd7-bc95-b9074caffa7f";
    public static final String REFERENCEABLE_TO_CERTIFICATION_TYPE_NAME          = "Certification";
    /* End1 = Referenceable; End 2 = CertificationType */


    public static final String CERTIFICATION_TYPE_TYPE_GUID              = "97f9ffc9-e2f7-4557-ac12-925257345eea";
    public static final String CERTIFICATION_TYPE_TYPE_NAME              = "CertificationType";
    /* GovernanceDefinition */

    public static final String DETAILS_PROPERTY_NAME                     = "details";                   /* from CertificationType entity */

    public static final String CERTIFICATION_OF_REFERENCEABLE_TYPE_GUID  = "390559eb-6a0c-4dd7-bc95-b9074caffa7f";
    public static final String CERTIFICATION_OF_REFERENCEABLE_TYPE_NAME  = "Certification";
    /* End1 = Referenceable; End 2 = CertificationType */

    public static final String CERTIFICATE_GUID_PROPERTY_NAME            = "certificateGUID";           /* from Certification relationship */
    public static final String START_PROPERTY_NAME                       = "start";                     /* from Certification relationship */
    public static final String END_PROPERTY_NAME                         = "end";                       /* from Certification relationship */
    public static final String CONDITIONS_PROPERTY_NAME                  = "conditions";                /* from Certification relationship */
    public static final String CERTIFIED_BY_PROPERTY_NAME                = "certifiedBy";               /* from Certification relationship */
    public static final String CUSTODIAN_PROPERTY_NAME                   = "custodian";                 /* from Certification relationship */
    public static final String RECIPIENT_PROPERTY_NAME                   = "recipient";                 /* from Certification relationship */
    public static final String NOTES_PROPERTY_NAME                       = "notes";                     /* from Certification relationship */

    public static final String CERTIFICATION_LINK_TYPE_GUID  = "390559eb-6a0c-4dd7-bc95-b9074caffa7f";
    public static final String CERTIFICATION_LINK_TYPE_NAME  = "Certification";
    /* End1 = CertificationType; End 2 = CertificationType */

    public static final String REFERENCEABLE_TO_LICENSE_TYPE_GUID                = "35e53b7f-2312-4d66-ae90-2d4cb47901ee";
    public static final String REFERENCEABLE_TO_LICENSE_TYPE_NAME                = "License";
    /* End1 = Referenceable; End 2 = LicenseType */

    public static final String LICENSE_TYPE_TYPE_GUID                 = "046a049d-5f80-4e5b-b0ae-f3cf6009b513";
    public static final String LICENSE_TYPE_TYPE_NAME                 = "LicenseType";
    /* GovernanceDefinition */

    public static final String LICENSE_OF_REFERENCEABLE_TYPE_GUID     = "35e53b7f-2312-4d66-ae90-2d4cb47901ee";
    public static final String LICENSE_OF_REFERENCEABLE_TYPE_NAME     = "License";
    /* End1 = Referenceable; End 2 = LicenseType */

    public static final String LICENSE_GUID_PROPERTY_NAME             = "licenseGUID";         /* from License relationship */
    public static final String LICENSED_BY_PROPERTY_NAME              = "licensedBy";          /* from License relationship */
    public static final String LICENSE_RECIPIENT_PROPERTY_NAME        = "licensee";            /* from License relationship */

    public static final String SECURITY_TAG_CLASSIFICATION_TYPE_GUID             = "a0b07a86-9fd3-40ca-bb9b-fe83c6981deb";
    public static final String SECURITY_TAG_CLASSIFICATION_TYPE_NAME             = "SecurityTags";
    public static final String SECURITY_LABELS_PROPERTY_NAME                     = "securityLabels";
    public static final String SECURITY_PROPERTIES_PROPERTY_NAME                 = "securityProperties";

    public static final String ASSET_ORIGIN_CLASSIFICATION_GUID          = "e530c566-03d2-470a-be69-6f52bfbd5fb7";
    public static final String ASSET_ORIGIN_CLASSIFICATION_NAME          = "AssetOrigin";

    public static final String ORGANIZATION_GUID_PROPERTY_NAME           = "organization";                         /* from AssetOrigin classification */
    public static final String BUSINESS_CAPABILITY_GUID_PROPERTY_NAME    = "businessCapability";                   /* from AssetOrigin classification */
    public static final String OTHER_ORIGIN_VALUES_PROPERTY_NAME         = "otherOriginValues";                    /* from AssetOrigin classification */

    public static final String ASSET_ZONES_CLASSIFICATION_GUID           = "a1c17a86-9fd3-40ca-bb9b-fe83c6981deb";
    public static final String ASSET_ZONES_CLASSIFICATION_NAME           = "AssetZoneMembership";

    public static final String ZONE_MEMBERSHIP_PROPERTY_NAME             = "zoneMembership";                       /* from Area 4 */

    public static final String ASSET_OWNERSHIP_CLASSIFICATION_GUID       = "d531c566-03d2-470a-be69-6f52cabd5fb9";
    public static final String ASSET_OWNERSHIP_CLASSIFICATION_NAME       = "AssetOwnership";

    public static final String OWNER_PROPERTY_NAME                       = "owner";                                /* from Area 4 */
    public static final String OWNER_TYPE_PROPERTY_NAME                  = "ownerType";
    /* from Asset entity */
    public static final String ASSET_OWNER_TYPE_ENUM_TYPE_GUID           = "9548390c-69f5-4dc6-950d-6feeee257b56";
    public static final String ASSET_OWNER_TYPE_ENUM_TYPE_NAME           = "AssetOwnerType";
    public static final int    USER_ID_OWNER_TYPE_ORDINAL                = 0;
    public static final int    PROFILE_ID_OWNER_TYPE_ORDINAL             = 1;
    public static final int    OTHER_OWNER_TYPE_ORDINAL                  = 99;

    /* ============================================================================================================================*/
    /* Area 5 - Schemas and Models                                                                                                 */
    /* ============================================================================================================================*/

    public static final String ASSET_TO_SCHEMA_TYPE_TYPE_GUID            = "815b004d-73c6-4728-9dd9-536f4fe803cd";  /* from Area 5 */
    public static final String ASSET_TO_SCHEMA_TYPE_TYPE_NAME            = "AssetSchemaType";
    /* End1 = Asset; End 2 = SchemaType */

    public static final String SCHEMA_ELEMENT_TYPE_GUID                 = "718d4244-8559-49ed-ad5a-10e5c305a656";   /* from Area 5 */
    public static final String SCHEMA_ELEMENT_TYPE_NAME                 = "SchemaElement";
    /* Referenceable */

    public static final String SCHEMA_DISPLAY_NAME_PROPERTY_NAME = "displayName";          /* from SchemaElement entity */
    public static final String SCHEMA_DESCRIPTION_PROPERTY_NAME  = "description";          /* from SchemaElement entity */
    public static final String IS_DEPRECATED_PROPERTY_NAME       = "isDeprecated";         /* from SchemaElement and ValidValueDefinition entity */

    /* For Schema Type */
    public static final String SCHEMA_TYPE_TYPE_GUID                    = "5bd4a3e7-d22d-4a3d-a115-066ee8e0754f";   /* from Area 5 */
    public static final String SCHEMA_TYPE_TYPE_NAME                    = "SchemaType";
    /* SchemaElement */

    public static final String VERSION_NUMBER_PROPERTY_NAME    = "versionNumber";        /* from SchemaType entity */
    public static final String AUTHOR_PROPERTY_NAME            = "author";               /* from SchemaType entity */
    public static final String SCHEMA_USAGE_PROPERTY_NAME      = "usage";                /* from SchemaType entity */
    public static final String ENCODING_STANDARD_PROPERTY_NAME = "encodingStandard";     /* from SchemaType entity */
    public static final String NAMESPACE_PROPERTY_NAME         = "namespace";            /* from SchemaType entity */

    /* For Complex Schema Type */
    public static final String COMPLEX_SCHEMA_TYPE_TYPE_GUID            = "786a6199-0ce8-47bf-b006-9ace1c5510e4";    /* from Area 5 */
    public static final String COMPLEX_SCHEMA_TYPE_TYPE_NAME            = "ComplexSchemaType";
    /* SchemaType */

    public static final String STRUCT_SCHEMA_TYPE_TYPE_GUID             = "a13b409f-fd67-4506-8d94-14dfafd250a4";    /* from Area 5 */
    public static final String STRUCT_SCHEMA_TYPE_TYPE_NAME             = "StructSchemaType";
    /* ComplexSchemaType */

    public static final String TYPE_TO_ATTRIBUTE_RELATIONSHIP_TYPE_GUID = "86b176a2-015c-44a6-8106-54d5d69ba661";  /* from Area 5 */
    public static final String TYPE_TO_ATTRIBUTE_RELATIONSHIP_TYPE_NAME = "AttributeForSchema";
    /* End1 = ComplexSchemaType; End 2 = SchemaAttribute */

    /* For Literal Schema Type */
    public static final String LITERAL_SCHEMA_TYPE_TYPE_GUID            = "520ebb91-c4eb-4d46-a3b1-974875cdcf0d";  /* from Area 5 */
    public static final String LITERAL_SCHEMA_TYPE_TYPE_NAME            = "LiteralSchemaType";
    /* SchemaType */

    /* For External Schema Type */
    public static final String EXTERNAL_SCHEMA_TYPE_TYPE_GUID           = "78de00ea-3d69-47ff-a6d6-767587526624";  /* from Area 5 */
    public static final String EXTERNAL_SCHEMA_TYPE_TYPE_NAME           = "ExternalSchemaType";
    /* SchemaType */

    public static final String LINKED_EXTERNAL_SCHEMA_TYPE_RELATIONSHIP_TYPE_GUID = "9a5d78c2-1716-4783-bfc6-c300a9e2d092";  /* from Area 5 */
    public static final String LINKED_EXTERNAL_SCHEMA_TYPE_RELATIONSHIP_TYPE_NAME = "LinkedExternalSchemaType";
    /* End1 = SchemaElement; End 2 = SchemaType */

    /* For Schema Type Choice */
    public static final String SCHEMA_TYPE_CHOICE_TYPE_GUID             = "5caf954a-3e33-4cbd-b17d-8b8613bd2db8";  /* from Area 5 */
    public static final String SCHEMA_TYPE_CHOICE_TYPE_NAME             = "SchemaTypeChoice";
    /* SchemaType */

    public static final String SCHEMA_TYPE_OPTION_RELATIONSHIP_TYPE_GUID = "eb4f1f98-c649-4560-8a46-da17c02764a9";   /* from Area 5 */
    public static final String SCHEMA_TYPE_OPTION_RELATIONSHIP_TYPE_NAME = "SchemaTypeOption";
    /* End1 = SchemaTypeChoice; End 2 = SchemaType */

    /* For Schema Type Choice */
    public static final String SIMPLE_SCHEMA_TYPE_TYPE_GUID            = "b5ec6e07-6419-4225-9dc4-fb55aba255c6";  /* from Area 5 */
    public static final String SIMPLE_SCHEMA_TYPE_TYPE_NAME            = "SimpleSchemaType";
    /* SchemaType */

    /* For Primitive Schema Type */
    public static final String PRIMITIVE_SCHEMA_TYPE_TYPE_GUID          = "f0f75fba-9136-4082-8352-0ad74f3c36ed";  /* from Area 5 */
    public static final String PRIMITIVE_SCHEMA_TYPE_TYPE_NAME          = "PrimitiveSchemaType";
    /* SimpleSchemaType */

    /* For Enum Schema Type */
    public static final String ENUM_SCHEMA_TYPE_TYPE_GUID               = "24b092ac-42e9-43dc-aeca-eb034ce307d9";  /* from Area 5 */
    public static final String ENUM_SCHEMA_TYPE_TYPE_NAME               = "EnumSchemaType";
    /* SimpleSchemaType */

    public static final String DATA_TYPE_PROPERTY_NAME                  = "dataType";     /* from SimpleSchemaType and LiteralSchemaType entity */
    public static final String DEFAULT_VALUE_PROPERTY_NAME              = "defaultValue"; /* from PrimitiveSchemaType entity */
    public static final String FIXED_VALUE_PROPERTY_NAME                = "fixedValue";   /* from LiteralSchemaType entity */

    /* For Map Schema Type */
    public static final String MAP_SCHEMA_TYPE_TYPE_GUID                = "bd4c85d0-d471-4cd2-a193-33b0387a19fd";   /* from Area 5 */
    public static final String MAP_SCHEMA_TYPE_TYPE_NAME                = "MapSchemaType";
    /* SchemaType */

    public static final String MAP_TO_RELATIONSHIP_TYPE_GUID            = "8b9856b3-451e-45fc-afc7-fddefd81a73a";   /* from Area 5 */
    public static final String MAP_TO_RELATIONSHIP_TYPE_NAME            = "MapToElementType";
    /* End1 = MapSchemaType; End 2 = SchemaType */

    public static final String MAP_FROM_RELATIONSHIP_TYPE_GUID          = "6189d444-2da4-4cd7-9332-e48a1c340b44";   /* from Area 5 */
    public static final String MAP_FROM_RELATIONSHIP_TYPE_NAME          = "MapFromElementType";
    /* End1 = MapSchemaType; End 2 = SchemaType */

    /* For Bounded Schema Type (Deprecated) */
    public static final String BOUNDED_SCHEMA_TYPE_TYPE_GUID            = "77133161-37a9-43f5-aaa3-fd6d7ff92fdb";   /* from Area 5 */
    public static final String BOUNDED_SCHEMA_TYPE_TYPE_NAME            = "BoundedSchemaType";

    public static final String MAX_ELEMENTS_PROPERTY_NAME               = "maximumElements";      /* from BoundedSchemaType entity */

    public static final String BOUNDED_ELEMENT_RELATIONSHIP_TYPE_GUID   = "3e844049-e59b-45dd-8e62-cde1add59f9e";   /* from Area 5 */
    public static final String BOUNDED_ELEMENT_RELATIONSHIP_TYPE_NAME   = "BoundedSchemaElementType";
    /* End1 = BoundedSchemaType; End 2 = SchemaType */

    /* For Schema Attribute */
    public static final String SCHEMA_ATTRIBUTE_TYPE_GUID               = "1a5e159b-913a-43b1-95fe-04433b25fca9";   /* from Area 5 */
    public static final String SCHEMA_ATTRIBUTE_TYPE_NAME               = "SchemaAttribute";
    /* SchemaElement */

    public static final String ATTRIBUTE_NAME_PROPERTY_NAME             = "displayName";           /* from SchemaAttribute entity */
    public static final String OLD_ATTRIBUTE_NAME_PROPERTY_NAME         = "name";                  /* from SchemaAttribute entity */
    public static final String ELEMENT_POSITION_PROPERTY_NAME           = "position";              /* from SchemaAttribute entity */
    public static final String CARDINALITY_PROPERTY_NAME                = "cardinality";           /* from SchemaAttribute entity */
    public static final String MAX_CARDINALITY_PROPERTY_NAME            = "maxCardinality";        /* from SchemaAttribute entity */
    public static final String MIN_CARDINALITY_PROPERTY_NAME            = "minCardinality";        /* from SchemaAttribute entity */
    public static final String DEFAULT_VALUE_OVERRIDE_PROPERTY_NAME     = "defaultValueOverride";  /* from SchemaAttribute entity */
    public static final String ALLOWS_DUPLICATES_PROPERTY_NAME          = "allowsDuplicateValues"; /* from SchemaAttribute entity */
    public static final String ORDERED_VALUES_PROPERTY_NAME             = "orderedValues";         /* from SchemaAttribute entity */
    public static final String NATIVE_CLASS_PROPERTY_NAME               = "nativeClass";           /* from SchemaAttribute entity */
    public static final String ALIASES_PROPERTY_NAME                    = "aliases";               /* from SchemaAttribute entity */
    public static final String SORT_ORDER_PROPERTY_NAME                 = "sortOrder";             /* from SchemaAttribute entity */
    public static final String MIN_LENGTH_PROPERTY_NAME                 = "minimumLength";         /* from SchemaAttribute entity */
    public static final String LENGTH_PROPERTY_NAME                     = "length";                /* from SchemaAttribute entity */
    public static final String SIGNIFICANT_DIGITS_PROPERTY_NAME         = "significantDigits";     /* from SchemaAttribute entity */
    public static final String PRECISION_PROPERTY_NAME                  = "precision";             /* from SchemaAttribute entity */
    public static final String IS_NULLABLE_PROPERTY_NAME                = "isNullable";            /* from SchemaAttribute entity */

    public static final String ATTRIBUTE_TO_TYPE_RELATIONSHIP_TYPE_GUID = "2d955049-e59b-45dd-8e62-cde1add59f9e";  /* from Area 5 */
    public static final String ATTRIBUTE_TO_TYPE_RELATIONSHIP_TYPE_NAME = "SchemaAttributeType";
    /* End1 = SchemaAttribute; End 2 = SchemaType */

    public static final String DATA_ITEM_SORT_ORDER_TYPE_GUID           = "aaa4df8f-1aca-4de8-9abd-1ef2aadba300";  /* from Area 5 */
    public static final String DATA_ITEM_SORT_ORDER_TYPE_NAME           = "DataItemSortOrder";

    public static final String NESTED_ATTRIBUTE_RELATIONSHIP_TYPE_GUID  = "0ffb9d87-7074-45da-a9b0-ae0859611133";  /* from Area 5 */
    public static final String NESTED_ATTRIBUTE_RELATIONSHIP_TYPE_NAME  = "NestedSchemaAttribute";
    /* End1 = SchemaAttribute; End 2 = SchemaAttribute */

    public static final String TYPE_EMBEDDED_ATTRIBUTE_CLASSIFICATION_TYPE_GUID  = "e2bb76bb-774a-43ff-9045-3a05f663d5d9";  /* from Area 5 */
    public static final String TYPE_EMBEDDED_ATTRIBUTE_CLASSIFICATION_TYPE_NAME  = "TypeEmbeddedAttribute";
    /* Linked to SchemaAttribute */
    public static final String TYPE_NAME_PROPERTY_NAME                  = "typeName";      /* from TypeEmbeddedAttribute classification */

    /* For Schema Link */
    public static final String SCHEMA_LINK_TYPE_GUID                    = "67e08705-2d2a-4df6-9239-1818161a41e0";      /* from Area 5 */
    public static final String SCHEMA_LINK_TYPE_NAME                    = "SchemaLinkElement";
    /* SchemaElement */

    public static final String LINK_NAME_PROPERTY_NAME                  = "linkName";             /* from SchemaAttribute entity */
    public static final String LINK_PROPERTIES_PROPERTY_NAME            = "linkProperties";       /* from SchemaAttribute entity */

    public static final String LINK_TO_TYPE_RELATIONSHIP_TYPE_GUID      = "292125f7-5660-4533-a48a-478c5611922e";     /* from Area 5 */
    public static final String LINK_TO_TYPE_RELATIONSHIP_TYPE_NAME      = "LinkedType";
    /* End1 = SchemaLinkElement; End 2 = SchemaType */

    public static final String ATTRIBUTE_TO_LINK_RELATIONSHIP_TYPE_GUID = "db9583c5-4690-41e5-a580-b4e30a0242d3";     /* from Area 5 */
    public static final String ATTRIBUTE_TO_LINK_RELATIONSHIP_TYPE_NAME = "SchemaLinkToType";
    /* End1 = SchemaAttribute; End 2 = SchemaLinkElement */

    public static final String SCHEMA_QUERY_TARGET_RELATIONSHIP_TYPE_GUID = "1c2622b7-ac21-413c-89e1-6f61f348cd19"; /* from Area 5 */
    public static final String SCHEMA_QUERY_TARGET_RELATIONSHIP_TYPE_NAME = "DerivedSchemaTypeQueryTarget";
    /* End1 = SchemaElement; End 2 = SchemaElement (target) */

    public static final String QUERY_ID_PROPERTY_NAME                   = "queryId"; /* from DerivedSchemaTypeQueryTarget relationship */
    public static final String QUERY_PROPERTY_NAME                      = "query";   /* from DerivedSchemaTypeQueryTarget relationship */

    /* - Known Subtypes ------------------------------------------------------- */

    public static final String ARRAY_SCHEMA_TYPE_TYPE_GUID              = "ba8d29d2-a8a4-41f3-b29f-91ad924dd944";   /* from Area 5 */
    public static final String ARRAY_SCHEMA_TYPE_TYPE_NAME              = "ArraySchemaType";
    /* BoundedSchemaType */

    public static final String SET_SCHEMA_TYPE_TYPE_GUID                = "b2605d2d-10cd-443c-b3e8-abf15fb051f0";   /* from Area 5 */
    public static final String SET_SCHEMA_TYPE_TYPE_NAME                = "SetSchemaType";
    /* BoundedSchemaType */

    public static final String TABULAR_SCHEMA_TYPE_TYPE_GUID            = "248975ec-8019-4b8a-9caf-084c8b724233";   /* from Area 5 */
    public static final String TABULAR_SCHEMA_TYPE_TYPE_NAME            = "TabularSchemaType";
    /* ComplexSchemaType */

    public static final String TABULAR_COLUMN_TYPE_TYPE_GUID            = "a7392281-348d-48a4-bad7-f9742d7696fe";   /* from Area 5 */
    public static final String TABULAR_COLUMN_TYPE_TYPE_NAME            = "TabularColumnType";
    /* PrimitiveSchemaType */

    public static final String TABULAR_COLUMN_TYPE_GUID                 = "d81a0425-4e9b-4f31-bc1c-e18c3566da10";   /* from Area 5 */
    public static final String TABULAR_COLUMN_TYPE_NAME                 = "TabularColumn";
    /* PrimitiveSchemaType */

    public static final String DOCUMENT_SCHEMA_TYPE_TYPE_GUID           = "33da99cd-8d04-490c-9457-c58908da7794";   /* from Area 5 */
    public static final String DOCUMENT_SCHEMA_TYPE_TYPE_NAME           = "DocumentSchemaType";
    /* ComplexSchemaType */

    public static final String DOCUMENT_SCHEMA_ATTRIBUTE_TYPE_GUID      = "b5cefb7e-b198-485f-a1d7-8e661012499b";   /* from Area 5 */
    public static final String DOCUMENT_SCHEMA_ATTRIBUTE_TYPE_NAME      = "DocumentSchemaAttribute";
    /* SchemaAttribute */

    public static final String SIMPLE_DOCUMENT_TYPE_TYPE_GUID           = "42cfccbf-cc68-4980-8c31-0faf1ee002d3";   /* from Area 5 */
    public static final String SIMPLE_DOCUMENT_TYPE_TYPE_NAME           = "SimpleDocumentType";
    /* PrimitiveSchemaType */

    public static final String STRUCT_DOCUMENT_TYPE_TYPE_GUID           = "f6245c25-8f73-45eb-8fb5-fa17a5f27649";   /* from Area 5 */
    public static final String STRUCT_DOCUMENT_TYPE_TYPE_NAME           = "StructDocumentType";
    /* StructSchemaType */

    public static final String MAP_DOCUMENT_TYPE_TYPE_GUID              = "b0f09598-ceb6-415b-befc-563ecadd5727";   /* from Area 5 */
    public static final String MAP_DOCUMENT_TYPE_TYPE_NAME              = "MapDocumentType";
    /* MapSchemaType */

    public static final String OBJECT_SCHEMA_TYPE_TYPE_GUID             = "6920fda1-7c07-47c7-84f1-9fb044ae153e";   /* from Area 5 */
    public static final String OBJECT_SCHEMA_TYPE_TYPE_NAME             = "ObjectSchemaType";
    /* ComplexSchemaType */

    public static final String OBJECT_SCHEMA_ATTRIBUTE_TYPE_GUID        = "ccb408c0-582e-4a3a-a926-7082d53bb669";   /* from Area 5 */
    public static final String OBJECT_SCHEMA_ATTRIBUTE_TYPE_NAME        = "ObjectSchemaAttribute";
    /* SchemaAttribute */

    public static final String GRAPH_SCHEMA_TYPE_TYPE_GUID              = "983c5e72-801b-4e42-bc51-f109527f2317";   /* from Area 5 */
    public static final String GRAPH_SCHEMA_TYPE_TYPE_NAME              = "GraphSchemaType";
    /* ComplexSchemaType */

    public static final String GRAPH_VERTEX_TYPE_GUID                   = "1252ce12-540c-4724-ad70-f70940956de0";   /* from Area 5 */
    public static final String GRAPH_VERTEX_TYPE_NAME                   = "GraphVertex";
    /* SchemaAttribute */

    public static final String GRAPH_EDGE_TYPE_GUID                     = "d4104eb3-4f2d-4d83-aca7-e58dd8d5e0b1";   /* from Area 5 */
    public static final String GRAPH_EDGE_TYPE_NAME                     = "GraphEdge";
    /* SchemaAttribute */

    /* For Graph Edge/Vertex */
    public static final String GRAPH_EDGE_LINK_RELATIONSHIP_TYPE_GUID   = "503b4221-71c8-4ba9-8f3d-6a035b27971c";   /* from Area 5 */
    public static final String GRAPH_EDGE_LINK_RELATIONSHIP_TYPE_NAME   = "GraphEdgeLink";
    /* End1 = GraphEdge; End 2 = GraphVertex */

    public static final String RELATIONAL_DB_SCHEMA_TYPE_TYPE_GUID      = "f20f5f45-1afb-41c1-9a09-34d8812626a4";   /* from Area 5 */
    public static final String RELATIONAL_DB_SCHEMA_TYPE_TYPE_NAME      = "RelationalDBSchemaType";
    /* ComplexSchemaType */

    public static final String RELATIONAL_TABLE_TYPE_TYPE_GUID          = "1321bcc0-dc6a-48ed-9ca6-0c6f934b0b98";   /* from Area 5 */
    public static final String RELATIONAL_TABLE_TYPE_TYPE_NAME          = "RelationalTableType";
    /* TabularSchemaType */

    public static final String RELATIONAL_TABLE_TYPE_GUID               = "ce7e72b8-396a-4013-8688-f9d973067425";   /* from Area 5 */
    public static final String RELATIONAL_TABLE_TYPE_NAME               = "RelationalTable";
    /* SchemaAttribute */

    public static final String CALCULATED_VALUE_CLASSIFICATION_TYPE_GUID = "4814bec8-482d-463d-8376-160b0358e139";
    public static final String CALCULATED_VALUE_CLASSIFICATION_TYPE_NAME = "CalculatedValue";
    /* Linked to SchemaType */
    public static final String FORMULA_PROPERTY_NAME                     = "formula";          /* from CalculatedValue classification */

    public static final String RELATIONAL_COLUMN_TYPE_GUID              = "aa8d5470-6dbc-4648-9e2f-045e5df9d2f9";   /* from Area 5 */
    public static final String RELATIONAL_COLUMN_TYPE_NAME              = "RelationalColumn";
    /* TabularColumn */

    public static final String RELATIONAL_COLUMN_TYPE_TYPE_GUID         = "f0438d80-6eb9-4fac-bcc1-5efee5babcfc";   /* from Area 5 */
    public static final String RELATIONAL_COLUMN_TYPE_TYPE_NAME         = "RelationalColumnType";
    /* TabularColumnType */

    public static final String PRIMARY_KEY_CLASSIFICATION_TYPE_GUID     = "b239d832-50bd-471b-b17a-15a335fc7f40";
    public static final String PRIMARY_KEY_CLASSIFICATION_TYPE_NAME     = "PrimaryKey";
    /* Linked to RelationalColumn */
    public static final String PRIMARY_KEY_PATTERN_PROPERTY_NAME        = "keyPattern";    /* from PrimaryKey classification */
    public static final String PRIMARY_KEY_NAME_PROPERTY_NAME           = "name";          /* from PrimaryKey classification */

    public static final String FOREIGN_KEY_RELATIONSHIP_TYPE_GUID       = "3cd4e0e7-fdbf-47a6-ae88-d4b3205e0c07"; /* from Area 5 */
    public static final String FOREIGN_KEY_RELATIONSHIP_TYPE_NAME       = "ForeignKey";
    /* End1 = RelationalColumn; End 2 = RelationalColumn */
    public static final String FOREIGN_KEY_NAME_PROPERTY_NAME           = "name";          /* from ForeignKey relationship */
    public static final String FOREIGN_KEY_DESCRIPTION_PROPERTY_NAME    = "description";   /* from ForeignKey relationship */
    public static final String FOREIGN_KEY_CONFIDENCE_PROPERTY_NAME     = "confidence";    /* from ForeignKey relationship */
    public static final String FOREIGN_KEY_STEWARD_PROPERTY_NAME        = "steward";       /* from ForeignKey relationship */
    public static final String FOREIGN_KEY_SOURCE_PROPERTY_NAME         = "source";        /* from ForeignKey relationship */

    /* For Event Type */
    public static final String EVENT_TYPE_TYPE_GUID                     = "bead9aa4-214a-4596-8036-aa78395bbfb1";   /* from Area 5 */
    public static final String EVENT_TYPE_TYPE_NAME                     = "EventType";
    /* ComplexSchemaType */
    public static final String EVENT_SET_TYPE_GUID                      = "8bc88aba-d7e4-4334-957f-cfe8e8eadc32";   /* from Area 5 */
    public static final String EVENT_SET_TYPE_NAME                      = "EventSet";
    /* Collection */

    /* For API Schema Type */
    public static final String API_SCHEMA_TYPE_TYPE_GUID                = "b46cddb3-9864-4c5d-8a49-266b3fc95cb8";   /* from Area 5 */
    public static final String API_SCHEMA_TYPE_TYPE_NAME                = "APISchemaType";
    /* SchemaType */
    public static final String API_OPERATION_TYPE_GUID                  = "f1c0af19-2729-4fac-996e-a7badff3c21c";   /* from Area 5 */
    public static final String API_OPERATION_TYPE_NAME                  = "APIOperation";
    /* SchemaType */
    public static final String API_OPERATIONS_RELATIONSHIP_TYPE_GUID    = "03737169-ceb5-45f0-84f0-21c5929945af"; /* from Area 5 */
    public static final String API_OPERATIONS_RELATIONSHIP_TYPE_NAME    = "APIOperations";
    /* End1 = APISchemaType; End 2 = APIOperation */
    public static final String API_HEADER_RELATIONSHIP_TYPE_GUID        = "e8fb46d1-5f75-481b-aa66-f43ad44e2cc6"; /* from Area 5 */
    public static final String API_HEADER_RELATIONSHIP_TYPE_NAME        = "APIHeader";
    /* End1 = APIOperation; End 2 = SchemaType */
    public static final String API_REQUEST_RELATIONSHIP_TYPE_GUID       = "4ab3b466-31bd-48ea-8aa2-75623476f2e2"; /* from Area 5 */
    public static final String API_REQUEST_RELATIONSHIP_TYPE_NAME       = "APIRequest";
    /* End1 = APIOperation; End 2 = SchemaType */
    public static final String API_RESPONSE_RELATIONSHIP_TYPE_GUID      = "e8001de2-1bb1-442b-a66f-9addc3641eae"; /* from Area 5 */
    public static final String API_RESPONSE_RELATIONSHIP_TYPE_NAME      = "APIResponse";
    /* End1 = APIOperation; End 2 = SchemaType */

    public static final String REFERENCEABLE_TO_REFERENCE_VALUE_TYPE_GUID        = "111e6d2e-94e9-43ed-b4ed-f0d220668cbf";
    public static final String REFERENCEABLE_TO_REFERENCE_VALUE_TYPE_NAME        = "ReferenceValueAssignment";
    /* End1 = Referenceable; End 2 = ValidValueDefinition */


    public static final String VALID_VALUE_DEFINITION_TYPE_GUID         = "09b2133a-f045-42cc-bb00-ee602b74c618";   /* from Area 5 */
    public static final String VALID_VALUE_DEFINITION_TYPE_NAME         = "ValidValueDefinition";
    /* Referenceable */

    public static final String VALID_VALUE_DISPLAY_NAME_PROPERTY_NAME  = "name";                 /* from ValidValueDefinition entity */
    public static final String VALID_VALUE_DESCRIPTION_PROPERTY_NAME   = "description";          /* from ValidValueDefinition entity */
    public static final String USAGE_PROPERTY_NAME                     = "usage";                /* from ValidValueDefinition entity */
    public static final String VALID_VALUE_SCOPE_PROPERTY_NAME         = "scope";                /* from ValidValueDefinition entity */
    public static final String PREFERRED_VALUE_PROPERTY_NAME           = "preferredValue";       /* from ValidValueDefinition entity */

    public static final String VALID_VALUE_SET_TYPE_GUID                = "7de10805-7c44-40e3-a410-ffc51306801b";   /* from Area 5 */
    public static final String VALID_VALUE_SET_TYPE_NAME                = "ValidValuesSet";
    /* ValidValueDefinition */

    public static final String REFERENCE_DATA_CLASSIFICATION_TYPE_GUID  = "55e5ae33-39c6-4834-9d05-ef0ae4e0163b";  /* from Area 5 */
    public static final String REFERENCE_DATA_CLASSIFICATION_TYPE_NAME  = "ReferenceData";
    /* Linked to Asset */

    public static final String VALID_VALUES_ASSIGNMENT_RELATIONSHIP_TYPE_GUID = "c5d48b73-eadd-47db-ab64-3be99b2fb32d";  /* from Area 5 */
    public static final String VALID_VALUES_ASSIGNMENT_RELATIONSHIP_TYPE_NAME = "ValidValuesAssignment";
    /* End1 = Referenceable; End 2 = ValidValuesDefinition */

    public static final String IS_STRICT_REQUIREMENT_PROPERTY_NAME      = "strictRequirement";     /* from ValidValuesAssignment relationship */

    public static final String VALID_VALUES_MEMBER_RELATIONSHIP_TYPE_GUID = "6337c9cd-8e5a-461b-97f9-5151bcb97a9e";  /* from Area 5 */
    public static final String VALID_VALUES_MEMBER_RELATIONSHIP_TYPE_NAME = "ValidValueMember";
    /* End1 = ValidValuesSet; End 2 = ValidValuesDefinition */

    public static final String VALID_VALUES_IMPL_RELATIONSHIP_TYPE_GUID = "d9a39553-6a47-4477-a217-844300c07cf2";  /* from Area 5 */
    public static final String VALID_VALUES_IMPL_RELATIONSHIP_TYPE_NAME = "ValidValuesImplementation";
    /* End1 = ValidValuesDefinition; End 2 = Asset */

    public static final String SYMBOLIC_NAME_PROPERTY_NAME             = "symbolicName";            /* from ValidValuesImplementation relationship */
    public static final String IMPLEMENTATION_VALUE_PROPERTY_NAME      = "implementationValue";     /* from ValidValuesImplementation relationship */
    public static final String ADDITIONAL_VALUES_PROPERTY_NAME         = "additionalValues";        /* from ValidValuesImplementation relationship */

    public static final String VALID_VALUES_MAP_RELATIONSHIP_TYPE_GUID = "203ce62c-3cbf-4542-bf82-81820cba718f";  /* from Area 5 */
    public static final String VALID_VALUES_MAP_RELATIONSHIP_TYPE_NAME = "ValidValuesMapping";
    /* End1 = ValidValuesDefinition; End 2 = ValidValuesDefinition */

    public static final String VALID_VALUES_ASSOCIATION_DESCRIPTION_PROPERTY_NAME   = "associationDescription";  /* from ValidValuesMapping relationship */
    public static final String VALID_VALUES_CONFIDENCE_PROPERTY_NAME                = "confidence";              /* from ValidValuesMapping and ReferenceValueAssignment relationship */
    public static final String VALID_VALUES_STEWARD_PROPERTY_NAME                   = "steward";                 /* from ValidValuesMapping and ReferenceValueAssignment relationship */
    public static final String VALID_VALUES_NOTES_PROPERTY_NAME                     = "notes";                   /* from ValidValuesMapping and ReferenceValueAssignment relationship */

    public static final String REFERENCE_VALUE_ASSIGNMENT_RELATIONSHIP_TYPE_GUID = "111e6d2e-94e9-43ed-b4ed-f0d220668cbf";  /* from Area 5 */
    public static final String REFERENCE_VALUE_ASSIGNMENT_RELATIONSHIP_TYPE_NAME = "ReferenceValueAssignment";
    /* End1 = Referenceable; End 2 = ValidValuesDefinition */



    /* ============================================================================================================================*/
    /* Area 6 - Discovery                                                                                                          */
    /* ============================================================================================================================*/

    public static final String OPEN_DISCOVERY_ENGINE_TYPE_GUID       = "be650674-790b-487a-a619-0a9002488055";
    public static final String OPEN_DISCOVERY_ENGINE_TYPE_NAME       = "OpenDiscoveryEngine";
    /* SoftwareServerCapability */

    public static final String DISCOVERY_ENGINE_TYPE_GUID                = "be650674-790b-487a-a619-0a9002488055";
    public static final String DISCOVERY_ENGINE_TYPE_NAME                = "OpenDiscoveryEngine";

    // public static final String QUALIFIED_NAME_PROPERTY_NAME              = "qualifiedName";       /* from Referenceable entity */
    // public static final String DISPLAY_NAME_PROPERTY_NAME                = "name";                /* from SoftwareServerCapability entity */
    // public static final String DESCRIPTION_PROPERTY_NAME                 = "description";         /* from SoftwareServerCapability entity */
    public static final String TYPE_DESCRIPTION_PROPERTY_NAME            = "deployedImplementationType";                   /* from SoftwareServerCapability entity */
    // public static final String VERSION_PROPERTY_NAME                     = "capabilityVersion";                /* from SoftwareServerCapability entity */
    public static final String PATCH_LEVEL_PROPERTY_NAME                 = "patchLevel";             /* from SoftwareServerCapability entity */
    public static final String SOURCE_PROPERTY_NAME                      = "source";                 /* from SoftwareServerCapability entity */

    public static final String SUPPORTED_DISCOVERY_SERVICE_TYPE_GUID     = "dff45aeb-c65e-428c-9ab3-d756bc5d8dbb";
    public static final String SUPPORTED_DISCOVERY_SERVICE_TYPE_NAME     = "SupportedDiscoveryService";
    /* End1 = OpenDiscoveryService; End 2 = OpenDiscoveryEngine */

    public static final String DISCOVERY_REQUEST_TYPES_PROPERTY_NAME     = "discoveryRequestTypes";
    public static final String DEFAULT_ANALYSIS_PARAMETERS_PROPERTY_NAME = "defaultAnalysisParameters";

    public static final String DISCOVERY_SERVICE_TYPE_GUID               = "2f278dfc-4640-4714-b34b-303e84e4fc40";
    public static final String DISCOVERY_SERVICE_TYPE_NAME               = "OpenDiscoveryService";

    public static final String CONNECTION_TO_ASSET_TYPE_GUID             = "e777d660-8dbe-453e-8b83-903771f054c0";
    public static final String CONNECTION_TO_ASSET_TYPE_NAME             = "ConnectionToAsset";
    /* End1 = Connection; End 2 = Asset */

    public static final String DISCOVERY_ANALYSIS_REPORT_TYPE_GUID    = "acc7cbc8-09c3-472b-87dd-f78459323dcb";
    public static final String DISCOVERY_ANALYSIS_REPORT_TYPE_NAME    = "OpenDiscoveryAnalysisReport";
    /* Referenceable */

    // public static final String DISPLAY_NAME_PROPERTY_NAME             = "displayName";                /* from OpenDiscoveryAnalysisReport entity */
    // public static final String DESCRIPTION_PROPERTY_NAME              = "description";                /* from OpenDiscoveryAnalysisReport entity */
    public static final String EXECUTION_DATE_PROPERTY_NAME           = "executionDate";              /* from OpenDiscoveryAnalysisReport entity */
    public static final String ANALYSIS_PARAMS_PROPERTY_NAME          = "analysisParameters";         /* from OpenDiscoveryAnalysisReport entity */
    public static final String ANALYSIS_STEP_PROPERTY_NAME            = "discoveryRequestStep";       /* from OpenDiscoveryAnalysisReport entity */
    public static final String DISCOVERY_SERVICE_STATUS_PROPERTY_NAME = "discoveryServiceStatus";     /* from OpenDiscoveryAnalysisReport entity */
    // public static final String ANCHOR_GUID_PROPERTY_NAME              = "anchorGUID";                 /* from OpenDiscoveryAnalysisReport entity */

    public static final String DISCOVERY_REQUEST_STATUS_ENUM_TYPE_GUID  = "b2fdeddd-24eb-4e9c-a2a4-2693828d4a69";
    public static final String DISCOVERY_REQUEST_STATUS_ENUM_TYPE_NAME  = "DiscoveryServiceRequestStatus";

    public static final String REPORT_TO_ASSET_TYPE_GUID              = "7eded424-f176-4258-9ae6-138a46b2845f";     /* from Area 6 */
    public static final String REPORT_TO_ASSET_TYPE_NAME              = "AssetDiscoveryReport";
    /* End1 = Asset; End 2 = OpenDiscoveryAnalysisReport */

    public static final String REPORT_TO_ENGINE_TYPE_GUID             = "2c318c3a-5dc2-42cd-a933-0087d852f67f";    /* from Area 6 */
    public static final String REPORT_TO_ENGINE_TYPE_NAME             = "DiscoveryEngineReport";
    /* End1 = OpenDiscoveryEngine; End 2 = OpenDiscoveryAnalysisReport */

    public static final String REPORT_TO_SERVICE_TYPE_GUID            = "1744d72b-903d-4273-9229-de20372a17e2";   /* from Area 6 */
    public static final String REPORT_TO_SERVICE_TYPE_NAME            = "DiscoveryInvocationReport";
    /* End1 = OpenDiscoveryService; End 2 = OpenDiscoveryAnalysisReport */

    public static final String REPORT_TO_ANNOTATIONS_TYPE_GUID        = "51d386a3-3857-42e3-a3df-14a6cad08b93";   /* from Area 6 */
    public static final String REPORT_TO_ANNOTATIONS_TYPE_NAME        = "DiscoveredAnnotation";
    /* End1 = Annotation; End 2 = OpenDiscoveryAnalysisReport */


    public static final String ANNOTATION_TYPE_GUID    = "6cea5b53-558c-48f1-8191-11d48db29fb4";
    public static final String ANNOTATION_TYPE_NAME    = "Annotation";

    public static final String ANNOTATION_TYPE_PROPERTY_NAME       = "annotationType";        /* from Annotation entity */
    // public static final String SUMMARY_PROPERTY_NAME               = "summary";               /* from Annotation entity */
    // public static final String CONFIDENCE_LEVEL_PROPERTY_NAME      = "confidenceLevel";       /* from Annotation entity */
    public static final String EXPRESSION_PROPERTY_NAME            = "expression";            /* from Annotation entity */
    public static final String EXPLANATION_PROPERTY_NAME           = "explanation";           /* from Annotation entity */
    // public static final String ANALYSIS_STEP_PROPERTY_NAME         = "analysisStep";          /* from Annotation entity */
    public static final String JSON_PROPERTIES_PROPERTY_NAME       = "jsonProperties";        /* from Annotation entity */
    // public static final String ADDITIONAL_PROPERTIES_PROPERTY_NAME = "additionalProperties";  /* from Annotation entity */

    public static final String ANNOTATION_TO_EXTENSION_TYPE_GUID   = "605aaa6d-682e-405c-964b-ca6aaa94be1b";     /* from Area 6 */
    public static final String ANNOTATION_TO_EXTENSION_TYPE_NAME   = "Annotation";
    /* End1 = (extended)Annotation; End 2 = Annotation(Extension) */

    /* For AnnotationReview entity */
    public static final String ANNOTATION_REVIEW_TYPE_GUID         = "b893d6fc-642a-454b-beaf-809ee4dd876a";
    public static final String ANNOTATION_REVIEW_TYPE_NAME         = "AnnotationReview";

    public static final String REVIEW_DATE_PROPERTY_NAME           = "reviewDate";     /* from AnnotationReview entity */
    public static final String STEWARD_PROPERTY_NAME               = "steward";        /* from AnnotationReview entity */
    public static final String COMMENT_PROPERTY_NAME               = "comment";        /* from AnnotationReview entity */

    /* For AnnotationReviewLink relationship */
    public static final String ANNOTATION_REVIEW_LINK_TYPE_GUID    = "5d3c2fb7-fa04-4d77-83cb-fd9216a07769";
    public static final String ANNOTATION_REVIEW_LINK_TYPE_NAME    = "AnnotationReviewLink";
    /* End1 = Annotation; End 2 = AnnotationReview */

    public static final String ANNOTATION_STATUS_PROPERTY_NAME     = "annotationStatus";        /* from AnnotationReviewLink relationship */
    /* Enum Type AnnotationStatus */

    /* For SchemaAnalysisAnnotation entity */
    public static final String SCHEMA_ANALYSIS_ANNOTATION_TYPE_GUID         = "3c5aa68b-d562-4b04-b189-c7b7f0bf2ced";
    public static final String SCHEMA_ANALYSIS_ANNOTATION_TYPE_NAME         = "SchemaAnalysisAnnotation";

    public static final String SCHEMA_NAME_PROPERTY_NAME           = "schemaName";     /* from SchemaAnalysisAnnotation entity */
    public static final String SCHEMA_TYPE_PROPERTY_NAME           = "schemaType";     /* from SchemaAnalysisAnnotation entity */

    /* For DataField entity */
    public static final String DATA_FIELD_TYPE_GUID              = "3c5bbc8b-d562-4b04-b189-c7b7f0bf2cea";
    public static final String DATA_FIELD_TYPE_NAME              = "DataField";

    public static final String DATA_FIELD_NAME_PROPERTY_NAME               = "dataFieldName";        /* from DataField entity */
    public static final String DATA_FIELD_TYPE_PROPERTY_NAME               = "dataFieldType";        /* from DataField entity */
    public static final String DATA_FIELD_DESCRIPTION_PROPERTY_NAME        = "dataFieldDescription"; /* from DataField entity */
    public static final String DATA_FIELD_ALIASES_PROPERTY_NAME            = "dataFieldAliases";     /* from DataField entity */
    public static final String DATA_FIELD_SORT_ORDER_PROPERTY_NAME         = "dataFieldName";        /* from DataField entity */
    public static final String DATA_FIELD_DEFAULT_VALUE_PROPERTY_NAME      = "defaultValue";         /* from DataField entity */

    /* For DiscoveredDataField relationship */
    public static final String DISCOVERED_DATA_FIELD_TYPE_GUID    = "60f2d263-e24d-4f20-8c0d-b5e22222cd54";
    public static final String DISCOVERED_DATA_FIELD_TYPE_NAME    = "DiscoveredDataField";
    /* End1 = SchemaAnalysisAnnotation; End 2 = DataField */

    public static final String DATA_FIELD_POSITION_PROPERTY_NAME  = "dataFieldPosition"; /* from DiscoveredDataField and
                                                                                            DiscoveredNestedDataField relationship */

    /* For DataFieldAnnotation entity */
    public static final String DATA_FIELD_ANNOTATION_TYPE_GUID = "72ed6de6-79d9-4e7d-aefc-b969382fc4b0";
    public static final String DATA_FIELD_ANNOTATION_TYPE_NAME = "DataFieldAnnotation";
    /* Annotation */

    /* For ClassificationAnnotation entity */
    public static final String CLASSIFICATION_ANNOTATION_TYPE_GUID = "23e8287f-5c7e-4e03-8bd3-471fc7fc029c";
    public static final String CLASSIFICATION_ANNOTATION_TYPE_NAME = "ClassificationAnnotation";
    /* DataFieldAnnotation */

    public static final String CANDIDATE_CLASSIFICATIONS_PROPERTY_NAME  = "candidateClassifications";   /* from ClassificationAnnotation entity */

    /* For DataProfileAnnotation entity */
    public static final String DATA_PROFILE_ANNOTATION_TYPE_GUID = "bff1f694-afd0-4829-ab11-50a9fbaf2f5f";
    public static final String DATA_PROFILE_ANNOTATION_TYPE_NAME = "DataProfileAnnotation";
    /* DataFieldAnnotation */

    public static final String INFERRED_DATA_TYPE_PROPERTY_NAME  = "inferredDataType";    /* from DataProfileAnnotation entity */
    public static final String INFERRED_FORMAT_PROPERTY_NAME     = "inferredFormat";      /* from DataProfileAnnotation entity */
    public static final String INFERRED_LENGTH_PROPERTY_NAME     = "inferredLength";      /* from DataProfileAnnotation entity */
    public static final String INFERRED_PRECISION_PROPERTY_NAME  = "inferredPrecision";   /* from DataProfileAnnotation entity */
    public static final String INFERRED_SCALE_PROPERTY_NAME      = "inferredScale";       /* from DataProfileAnnotation entity */
    public static final String PROFILE_PROPERTIES_PROPERTY_NAME  = "profileProperties";   /* from DataProfileAnnotation entity */
    public static final String PROFILE_FLAGS_PROPERTY_NAME       = "profileFlags";        /* from DataProfileAnnotation entity */
    public static final String PROFILE_COUNTS_PROPERTY_NAME      = "profileCounts";       /* from DataProfileAnnotation entity */
    public static final String VALUE_LIST_PROPERTY_NAME          = "valueList";           /* from DataProfileAnnotation entity */
    public static final String VALUE_COUNT_PROPERTY_NAME         = "valueCount";          /* from DataProfileAnnotation entity */
    public static final String VALUE_RANGE_FROM_PROPERTY_NAME    = "valueRangeTo";        /* from DataProfileAnnotation entity */
    public static final String VALUE_RANGE_TO_PROPERTY_NAME      = "valueRangeTo";        /* from DataProfileAnnotation entity */
    public static final String AVERAGE_VALUE_PROPERTY_NAME       = "averageValue";        /* from DataProfileAnnotation entity */

    /* For DataProfileLogAnnotation entity */
    public static final String DATA_PROFILE_LOG_ANNOTATION_TYPE_GUID = "368e6fb3-7323-4f81-a723-5182491594bd";
    public static final String DATA_PROFILE_LOG_ANNOTATION_TYPE_NAME = "DataProfileLogAnnotation";
    /* DataFieldAnnotation */

    /* For DiscoveredDataField relationship */
    public static final String DATA_PROFILE_LOG_FILE_TYPE_GUID    = "75026fac-f9e5-4da8-9ad1-e9c68d47f577";
    public static final String DATA_PROFILE_LOG_FILE_TYPE_NAME    = "DataProfileLogFile";
    /* End1 = DataProfileLogAnnotation; End 2 = LogFile */

    /* For DataClassAnnotation entity */
    public static final String DATA_CLASS_ANNOTATION_TYPE_GUID = "0c8a3673-04ef-406f-899d-e88de67f6176";
    public static final String DATA_CLASS_ANNOTATION_TYPE_NAME = "DataClassAnnotation";
    /* DataFieldAnnotation */

    public static final String CANDIDATE_DATA_CLASS_GUIDS_PROPERTY_NAME  = "candidateDataClassGUIDs";   /* from DataClassAnnotation entity */
    public static final String MATCHING_VALUES_PROPERTY_NAME             = "matchingValues";            /* from DataClassAnnotation entity */
    public static final String NON_MATCHING_VALUES_PROPERTY_NAME         = "nonMatchingValues";         /* from DataClassAnnotation entity */

    /* For SemanticAnnotation entity */
    public static final String SEMANTIC_ANNOTATION_TYPE_GUID = "0b494819-28be-4604-b238-3af20963eea6";
    public static final String SEMANTIC_ANNOTATION_TYPE_NAME = "SemanticAnnotation";
    /* Annotation */

    public static final String INFORMAL_TERM_PROPERTY_NAME                     = "informalTerm";   /* from SemanticAnnotation entity */
    public static final String CANDIDATE_GLOSSARY_TERM_GUIDS_PROPERTY_NAME     = "candidateGlossaryTermGUIDs";  /* from SemanticAnnotation entity */
    public static final String INFORMAL_TOPIC_PROPERTY_NAME                    = "informalTopic";   /* from SemanticAnnotation entity */
    public static final String CANDIDATE_GLOSSARY_CATEGORY_GUIDS_PROPERTY_NAME = "candidateGlossaryCategoryGUIDs";  /* from SemanticAnnotation entity */

    /* For QualityAnnotation entity */
    public static final String QUALITY_ANNOTATION_TYPE_GUID = "72e6473d-4ce0-4609-80a4-e6e949a7f520";
    public static final String QUALITY_ANNOTATION_TYPE_NAME = "QualityAnnotation";
    /* DataFieldAnnotation */

    public static final String QUALITY_DIMENSION_PROPERTY_NAME        = "qualityDimension";   /* from QualityAnnotation entity */
    public static final String QUALITY_SCORE_PROPERTY_NAME            = "qualityScore";  /* from QualityAnnotation entity */

    /* For RelationshipAdviceAnnotation entity */
    public static final String RELATIONSHIP_ADVICE_ANNOTATION_TYPE_GUID = "740f07dc-4ee8-4c2a-baba-efb55c73eb68";
    public static final String RELATIONSHIP_ADVICE_ANNOTATION_TYPE_NAME = "RelationshipAdviceAnnotation";
    /* DataFieldAnnotation */

    public static final String RELATED_ENTITY_GUID_PROPERTY_NAME        = "relatedEntityGUID";      /* from RelationshipAdviceAnnotation entity */
    public static final String RELATIONSHIP_TYPE_NAME_PROPERTY_NAME     = "relationshipTypeName";   /* from RelationshipAdviceAnnotation entity */
    public static final String RELATIONSHIP_PROPERTIES_PROPERTY_NAME    = "relationshipProperties"; /* from RelationshipAdviceAnnotation entity */



    /* For SuspectDuplicateAnnotation entity */
    public static final String SUSPECT_DUPLICATE_ANNOTATION_TYPE_GUID = "f703a621-4078-4c07-ab22-e7c334b94235";
    public static final String SUSPECT_DUPLICATE_ANNOTATION_TYPE_NAME = "SuspectDuplicateAnnotation";
    /* plus Annotation */

    public static final String DUPLICATE_ANCHOR_GUIDS_PROPERTY_NAME        = "duplicateAnchorGUIDs";   /* from SuspectDuplicateAnnotation entity */
    public static final String MATCHING_PROPERTY_NAMES_PROPERTY_NAME       = "matchingPropertyNames";  /* from SuspectDuplicateAnnotation entity */
    public static final String MATCHING_CLASSIFICATION_NAMES_PROPERTY_NAME = "matchingClassificationNames"; /* from SuspectDuplicateAnnotation entity */
    public static final String MATCHING_ATTACHMENT_GUIDS_PROPERTY_NAME     = "matchingAttachmentGUIDS";  /* from SuspectDuplicateAnnotation entity */
    public static final String MATCHING_RELATIONSHIP_GUIDS_PROPERTY_NAME   = "matchingRelationshipGUIDs"; /* from SuspectDuplicateAnnotation entity */

    /* For DivergentDuplicateAnnotation entity */
    public static final String DIVERGENT_DUPLICATE_ANNOTATION_TYPE_GUID                = "251e443c-dee0-47fa-8a73-1a9d511915a0";
    public static final String DIVERGENT_DUPLICATE_ANNOTATION_TYPE_NAME                = "DivergentDuplicateAnnotation";
    /* plus Annotation */

    /* For DivergentValueAnnotation entity */
    public static final String DIVERGENT_VALUE_ANNOTATION_TYPE_GUID                    = "b86cdded-1078-4e42-b6ba-a718c2c67f62";
    public static final String DIVERGENT_VALUE_ANNOTATION_TYPE_NAME                    = "DivergentValueAnnotation";
    /* plus DivergentDuplicateAnnotation */

    /* For DivergentClassificationAnnotation entity */
    public static final String DIVERGENT_CLASSIFICATION_ANNOTATION_TYPE_GUID           = "8efd6257-a53e-451d-abfc-8e4899c38b1f";
    public static final String DIVERGENT_CLASSIFICATION_ANNOTATION_TYPE_NAME           = "DivergentClassificationAnnotation";
    /* plus DivergentDuplicateAnnotation */

    /* For DivergentRelationshipAnnotation entity */
    public static final String DIVERGENT_RELATIONSHIP_ANNOTATION_TYPE_GUID             = "b6c6938a-fdc9-438f-893c-0b5b1d4a5bb3";
    public static final String DIVERGENT_RELATIONSHIP_ANNOTATION_TYPE_NAME             = "DivergentRelationshipAnnotation";
    /* plus DivergentDuplicateAnnotation */

    /* For DivergentAttachmentAnnotation entity */
    public static final String DIVERGENT_ATTACHMENT_ANNOTATION_TYPE_GUID               = "f3ed48bc-b0ea-4e1f-a8ab-75f9f3cf87a6";
    public static final String DIVERGENT_ATTACHMENT_ANNOTATION_TYPE_NAME               = "DivergentAttachmentAnnotation";
    /* plus DivergentDuplicateAnnotation */

    /* For DivergentAttachmentValueAnnotation entity */
    public static final String DIVERGENT_ATTACHMENT_VALUE_ANNOTATION_TYPE_GUID         = "e22a1ffe-bd90-4faf-b6a1-13fafb7948a2";
    public static final String DIVERGENT_ATTACHMENT_VALUE_ANNOTATION_TYPE_NAME         = "DivergentAttachmentValueAnnotation";
    /* plus DivergentAttachmentAnnotation */

    /* For DivergentAttachmentClassificationAnnotation entity */
    public static final String DIVERGENT_ATTACHMENT_CLASS_ANNOTATION_TYPE_GUID         = "a2a5cb74-f8e0-470f-be71-26b7e32166a6";
    public static final String DIVERGENT_ATTACHMENT_CLASS_ANNOTATION_TYPE_NAME         = "DivergentAttachmentClassificationAnnotation";
    /* plus DivergentAttachmentAnnotation */

    /* For DivergentAttachmentRelationshipAnnotation entity */
    public static final String DIVERGENT_ATTACHMENT_REL_ANNOTATION_TYPE_GUID           = "5613677a-865f-474e-8044-4167fa5a31b9";
    public static final String DIVERGENT_ATTACHMENT_REL_ANNOTATION_TYPE_NAME           = "DivergentAttachmentRelationshipAnnotation";
    /* plus DivergentAttachmentAnnotation */

    /* for divergent annotations */
    public static final String DUPLICATE_ANCHOR_GUID_PROPERTY_NAME                      = "duplicateAnchorGUID";
    // public static final String ATTACHMENT_GUID_PROPERTY_NAME                            = "attachmentGUID";
    public static final String DUPLICATE_ATTACHMENT_GUID_PROPERTY_NAME                  = "duplicateAttachmentGUID";
    public static final String DIVERGENT_PROPERTY_NAMES_PROPERTY_NAME                   = "divergentPropertyNames";
    public static final String DIVERGENT_CLASSIFICATION_NAME_PROPERTY_NAME              = "divergentClassificationName";
    public static final String DIVERGENT_CLASSIFICATION_PROPERTY_NAMES_PROPERTY_NAME    = "divergentClassificationPropertyNames";
    public static final String DIVERGENT_RELATIONSHIP_GUID_PROPERTY_NAME                = "divergentRelationshipGUID";
    public static final String DIVERGENT_RELATIONSHIP_PROPERTY_NAMES_PROPERTY_NAME      = "divergentRelationshipPropertyNames";

    /* For DataSourceMeasurementAnnotation entity */
    public static final String DATA_SOURCE_MEASUREMENT_ANNOTATION_TYPE_GUID         = "c85bea73-d7af-46d7-8a7e-cb745910b1d";
    public static final String DATA_SOURCE_MEASUREMENT_ANNOTATION_TYPE_NAME         = "DataSourceMeasurementAnnotation";
    /* plus Annotation */

    public static final String DATA_SOURCE_PROPERTIES_PROPERTY_NAME    = "dataSourceProperties";  /* from DataSourceMeasurementAnnotation entity */

    /* For DataSourcePhysicalStatusAnnotation entity */
    public static final String DS_PHYSICAL_STATUS_ANNOTATION_TYPE_GUID         = "e9ba276e-6d9f-4999-a5a9-9ddaaabfae23";
    public static final String DS_PHYSICAL_STATUS_ANNOTATION_TYPE_NAME         = "DataSourcePhysicalStatusAnnotation";
    /* plus DataSourceMeasurementAnnotation */

    public static final String DS_PHYSICAL_CREATE_TIME_PROPERTY_NAME    = "sourceCreateTime";      /* from DataSourcePhysicalStatusAnnotation entity */
    public static final String DS_PHYSICAL_MODIFIED_TIME_PROPERTY_NAME  = "sourceUpdateTime";    /* from DataSourcePhysicalStatusAnnotation entity */
    public static final String DS_PHYSICAL_SIZE_PROPERTY_NAME           = "size";            /* from DataSourcePhysicalStatusAnnotation entity */
    public static final String DS_PHYSICAL_ENCODING_PROPERTY_NAME       = "encoding";        /* from DataSourcePhysicalStatusAnnotation entity */

    /* For Request For Action Annotation entity */
    public static final String REQUEST_FOR_ACTION_ANNOTATION_TYPE_GUID         = "f45765a9-f3ae-4686-983f-602c348e020d";
    public static final String REQUEST_FOR_ACTION_ANNOTATION_TYPE_NAME         = "RequestForActionAnnotation";
    /* plus DataFieldAnnotation */

    public static final String DISCOVERY_ACTIVITY_PROPERTY_NAME    = "discoveryActivity";      /* from RequestForActionAnnotation entity */
    public static final String ACTION_REQUESTED_PROPERTY_NAME      = "actionRequested";        /* from RequestForActionAnnotation entity */
    public static final String ACTION_PROPERTIES_PROPERTY_NAME     = "actionProperties";       /* from RequestForActionAnnotation entity */

    /* For Discovery Activity relationship */
    public static final String DISCOVERY_ACTIVITY_TYPE_GUID    = "6cea5b53-558c-48f1-8191-11d48db29fb4";
    public static final String DISCOVERY_ACTIVITY_TYPE_NAME    = "DiscoveryActivity";
    /* End1 = RequestForActionAnnotation; End 2 = RequestForAction */

    public static final String DISCOVERY_ACTIVITY_DESCRIPTION_PROPERTY_NAME     = "description";        /* from DiscoveryActivity relationship */

    /* ============================================================================================================================*/
    /* Area 7 - Lineage                                                                                                            */
    /* ============================================================================================================================*/

}
