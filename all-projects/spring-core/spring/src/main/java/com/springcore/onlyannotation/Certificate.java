package com.springcore.onlyannotation;

import org.springframework.beans.factory.annotation.Value;

public class Certificate {
	
	@Value("101")
	private int certificateId;
	
	@Value("JavaCertification")
	private String certificateName;
	
	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	@Override
	public String toString() {
		return "Certificate [certificateId=" + certificateId + ", certificateName=" + certificateName + "]";
	}
	
	
}
