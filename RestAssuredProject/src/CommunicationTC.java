import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CommunicationTC {

	@Test
	void test() {
		
		String communicationpayload = 
				"{\r\n"
				+ "	\"resourceType\": \"Bundle\",\r\n"
				+ "	\"id\": \"e753a38c-21a0-4838-96f6-56019f3c5774\",\r\n"
				+ "	\"meta\": {\r\n"
				+ "		\"profile\": [\r\n"
				+ "			\"http://nphies.sa/fhir/ksa/nphies-fs/StructureDefinition/bundle|1.0.0\"\r\n"
				+ "		]\r\n"
				+ "	},\r\n"
				+ "	\"type\": \"message\",\r\n"
				+ "	\"timestamp\": \"2021-12-02T16:47:49.544Z\",\r\n"
				+ "	\"entry\": [\r\n"
				+ "		{\r\n"
				+ "			\"fullUrl\": \"http://saudicentralpharmacy.sa.com/MessageHeader/7f495571-6031-461e-93b2-6fbeedf85774\",\r\n"
				+ "			\"resource\": {\r\n"
				+ "				\"resourceType\": \"MessageHeader\",\r\n"
				+ "				\"id\": \"7f495571-6031-461e-93b2-6fbeedf85774\",\r\n"
				+ "				\"meta\": {\r\n"
				+ "					\"profile\": [\r\n"
				+ "						\"http://nphies.sa/fhir/ksa/nphies-fs/StructureDefinition/message-header|1.0.0\"\r\n"
				+ "					]\r\n"
				+ "				},\r\n"
				+ "				\"eventCoding\": {\r\n"
				+ "					\"system\": \"http://nphies.sa/terminology/CodeSystem/ksa-message-events\",\r\n"
				+ "					\"code\": \"communication\"\r\n"
				+ "				},\r\n"
				+ "				\"destination\": [\r\n"
				+ "					{\r\n"
				+ "						\"endpoint\": \"http://nphies.sa/license/payer-license/INS-FHIR\",\r\n"
				+ "						\"receiver\": {\r\n"
				+ "							\"type\": \"Organization\",\r\n"
				+ "							\"identifier\": {\r\n"
				+ "								\"system\": \"http://nphies.sa/license/payer-license\",\r\n"
				+ "								\"value\": \"INS-FHIR\"\r\n"
				+ "							}\r\n"
				+ "						}\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"sender\": {\r\n"
				+ "					\"type\": \"Organization\",\r\n"
				+ "					\"identifier\": {\r\n"
				+ "						\"system\": \"http://nphies.sa/license/provider-license\",\r\n"
				+ "						\"value\": \"PR-FHIR\"\r\n"
				+ "					}\r\n"
				+ "				},\r\n"
				+ "				\"source\": {\r\n"
				+ "					\"endpoint\": \"http://saudicentralpharmacy.sa.com\"\r\n"
				+ "				},\r\n"
				+ "				\"focus\": [\r\n"
				+ "					{\r\n"
				+ "						\"reference\": \"http://saudicentralpharmacy.sa.com/Communication/8956007\"\r\n"
				+ "					}\r\n"
				+ "				]\r\n"
				+ "			}\r\n"
				+ "		},\r\n"
				+ "		{\r\n"
				+ "			\"fullUrl\": \"http://saudicentralpharmacy.sa.com/Communication/8956007\",\r\n"
				+ "			\"resource\": {\r\n"
				+ "				\"resourceType\": \"Communication\",\r\n"
				+ "				\"id\": \"8956007\",\r\n"
				+ "				\"meta\": {\r\n"
				+ "					\"profile\": [\r\n"
				+ "						\"http://nphies.sa/fhir/ksa/nphies-fs/StructureDefinition/communication|1.0.0\"\r\n"
				+ "					]\r\n"
				+ "				},\r\n"
				+ "				\"identifier\": [\r\n"
				+ "					{\r\n"
				+ "						\"system\": \"http://saudicentralpharmacy.sa.com/communication\",\r\n"
				+ "						\"value\": \"Communication_202112029856099\"\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"status\": \"completed\",\r\n"
				+ "				\"category\": [\r\n"
				+ "					{\r\n"
				+ "						\"coding\": [\r\n"
				+ "							{\r\n"
				+ "								\"system\": \"http://terminology.hl7.org/CodeSystem/communication-category\",\r\n"
				+ "								\"code\": \"instruction\"\r\n"
				+ "							}\r\n"
				+ "						]\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"priority\": \"routine\",\r\n"
				+ "				\"subject\": {\r\n"
				+ "					\"reference\": \"http://saudicentralpharmacy.sa.com/Patient/123456777\"\r\n"
				+ "				},\r\n"
				+ "				\"about\": [\r\n"
				+ "					{\r\n"
				+ "						\"type\": \"Claim\",\r\n"
				+ "						\"identifier\": {\r\n"
				+ "							\"system\": \"http://saudicentralpharmacy.sa.com/claim\",\r\n"
				+ "							\"value\": \"req_00112489089\"\r\n"
				+ "						}\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"recipient\": [\r\n"
				+ "					{\r\n"
				+ "						\"reference\": \"http://sni.sa.com/Organization/bff3aa1fbd3648619ac082357bf135db\"\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"sender\": {\r\n"
				+ "					\"reference\": \"http://saudicentralpharmacy.sa.com/Organization/b1b3432921324f97af3be9fd0b1a34fa\"\r\n"
				+ "				}\r\n"
				+ "			}\r\n"
				+ "		},\r\n"
				+ "		{\r\n"
				+ "			\"fullUrl\": \"http://saudicentralpharmacy.sa.com/Patient/123456777\",\r\n"
				+ "			\"resource\": {\r\n"
				+ "				\"resourceType\": \"Patient\",\r\n"
				+ "				\"id\": \"123456777\",\r\n"
				+ "				\"meta\": {\r\n"
				+ "					\"profile\": [\r\n"
				+ "						\"http://nphies.sa/fhir/ksa/nphies-fs/StructureDefinition/patient|1.0.0\"\r\n"
				+ "					]\r\n"
				+ "				},\r\n"
				+ "				\"identifier\": [\r\n"
				+ "					{\r\n"
				+ "						\"type\": {\r\n"
				+ "							\"coding\": [\r\n"
				+ "								{\r\n"
				+ "									\"system\": \"http://terminology.hl7.org/CodeSystem/v2-0203\",\r\n"
				+ "									\"code\": \"PRC\",\r\n"
				+ "									\"display\": \"iqama\"\r\n"
				+ "								}\r\n"
				+ "							]\r\n"
				+ "						},\r\n"
				+ "						\"system\": \"http://nphies.sa/identifier/iqama\",\r\n"
				+ "						\"value\": \"5555346\"\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"active\": true,\r\n"
				+ "				\"name\": [\r\n"
				+ "					{\r\n"
				+ "						\"use\": \"official\",\r\n"
				+ "						\"text\": \"Zahi Fathi abdullah Tareeq\",\r\n"
				+ "						\"family\": \"Tareeq\",\r\n"
				+ "						\"given\": [\r\n"
				+ "							\"Zahi\",\r\n"
				+ "							\"Fathi\",\r\n"
				+ "							\"abdullah\"\r\n"
				+ "						]\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"telecom\": [\r\n"
				+ "					{\r\n"
				+ "						\"system\": \"phone\",\r\n"
				+ "						\"value\": \"+966512345691\"\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"gender\": \"male\",\r\n"
				+ "				\"_gender\": {\r\n"
				+ "					\"extension\": [\r\n"
				+ "						{\r\n"
				+ "							\"url\": \"http://nphies.sa/fhir/ksa/nphies-fs/StructureDefinition/extension-ksa-administrative-gender\",\r\n"
				+ "							\"valueCodeableConcept\": {\r\n"
				+ "								\"coding\": [\r\n"
				+ "									{\r\n"
				+ "										\"system\": \"http://nphies.sa/terminology/CodeSystem/ksa-administrative-gender\",\r\n"
				+ "										\"code\": \"male\",\r\n"
				+ "										\"display\": \"Male\"\r\n"
				+ "									}\r\n"
				+ "								]\r\n"
				+ "							}\r\n"
				+ "						}\r\n"
				+ "					]\r\n"
				+ "				},\r\n"
				+ "				\"birthDate\": \"1988-10-13\"\r\n"
				+ "			}\r\n"
				+ "		},\r\n"
				+ "		{\r\n"
				+ "			\"fullUrl\": \"http://saudicentralpharmacy.sa.com/Organization/b1b3432921324f97af3be9fd0b1a34fa\",\r\n"
				+ "			\"resource\": {\r\n"
				+ "				\"resourceType\": \"Organization\",\r\n"
				+ "				\"id\": \"b1b3432921324f97af3be9fd0b1a34fa\",\r\n"
				+ "				\"meta\": {\r\n"
				+ "					\"profile\": [\r\n"
				+ "						\"http://nphies.sa/fhir/ksa/nphies-fs/StructureDefinition/provider-organization|1.0.0\"\r\n"
				+ "					]\r\n"
				+ "				},\r\n"
				+ "				\"identifier\": [\r\n"
				+ "					{\r\n"
				+ "						\"system\": \"http://nphies.sa/license/provider-license\",\r\n"
				+ "						\"value\": \"PR-FHIR\"\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"active\": true,\r\n"
				+ "				\"type\": [\r\n"
				+ "					{\r\n"
				+ "						\"coding\": [\r\n"
				+ "							{\r\n"
				+ "								\"system\": \"http://nphies.sa/terminology/CodeSystem/organization-type\",\r\n"
				+ "								\"code\": \"prov\"\r\n"
				+ "							}\r\n"
				+ "						]\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"name\": \"Saudi Central Pharmacy\"\r\n"
				+ "			}\r\n"
				+ "		},\r\n"
				+ "		{\r\n"
				+ "			\"fullUrl\": \"http://sni.sa.com/Organization/bff3aa1fbd3648619ac082357bf135db\",\r\n"
				+ "			\"resource\": {\r\n"
				+ "				\"resourceType\": \"Organization\",\r\n"
				+ "				\"id\": \"bff3aa1fbd3648619ac082357bf135db\",\r\n"
				+ "				\"meta\": {\r\n"
				+ "					\"profile\": [\r\n"
				+ "						\"http://nphies.sa/fhir/ksa/nphies-fs/StructureDefinition/insurer-organization|1.0.0\"\r\n"
				+ "					]\r\n"
				+ "				},\r\n"
				+ "				\"identifier\": [\r\n"
				+ "					{\r\n"
				+ "						\"system\": \"http://nphies.sa/license/payer-license\",\r\n"
				+ "						\"value\": \"INS-FHIR\"\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"active\": true,\r\n"
				+ "				\"type\": [\r\n"
				+ "					{\r\n"
				+ "						\"coding\": [\r\n"
				+ "							{\r\n"
				+ "								\"system\": \"http://nphies.sa/terminology/CodeSystem/organization-type\",\r\n"
				+ "								\"code\": \"ins\"\r\n"
				+ "							}\r\n"
				+ "						]\r\n"
				+ "					}\r\n"
				+ "				],\r\n"
				+ "				\"name\": \"Saudi National Insurance\"\r\n"
				+ "			}\r\n"
				+ "		}\r\n"
				+ "	]\r\n"
				+ "}";
		
	}

}
