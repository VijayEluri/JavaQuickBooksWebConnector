package com.cantero.quickbooks.ws;

import java.util.ArrayList;

import javax.jws.WebService;

/*
 * http://developer.intuit.com/qbsdk-current/doc/pdf/qbwc_proguide.pdf
 */
@WebService(endpointInterface = "com.cantero.quickbooks.ws.QBWebConnectorSvcSoap")
public class ItemQueryRqSoapImpl implements QBWebConnectorSvcSoap {


	@Override
	public ArrayOfString authenticate(String strUserName, String strPassword) {
		ArrayOfString arr = new ArrayOfString();
		arr.string = new ArrayList<String>();
		arr.string.add("The first element is a token for the web connectorÕs session");
		arr.string.add(""); //To use the currently open company, specify an empty string
		return arr;
	}

	@Override
	public String closeConnection(String ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String connectionError(String ticket, String hresult, String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastError(String ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int receiveResponseXML(String ticket, String response,
			String hresult, String message) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String sendRequestXML(String ticket, String strHCPResponse,
			String strCompanyFileName, String qbXMLCountry, int qbXMLMajorVers,
			int qbXMLMinorVers) {
		//Example qbXML to Query for an Item
		//http://www.consolibyte.com/wiki/doku.php/quickbooks_qbxml_itemquery
		String query = "<?xml version=\"1.0\" encoding=\"utf-8\"?><?qbxml version=\"7.0\"?><QBXML><QBXMLMsgsRq onError=\"stopOnError\"><ItemQueryRq requestID=\"SXRlbVF1ZXJ5fDEyMA==\"></ItemQueryRq></QBXMLMsgsRq></QBXML>";
		return query;
	}

}
