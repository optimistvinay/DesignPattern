package dp.structural.adapter;

public class RealtimeDocument implements SearchDocument {

	private String documentId;
	private String performanceId;
	private String shareClassId;
	private String country;
	
	
	
	public RealtimeDocument(String documentId, String performanceId,
			String shareClassId, String country) {
		this.documentId = documentId;
		this.performanceId = performanceId;
		this.shareClassId = shareClassId;
		this.country = country;
	}

	@Override
	public String getDocumentId() {
		return this.documentId;
	}

	@Override
	public String getPerformanceId() {
		return this.performanceId;
	}

	@Override
	public String getShareClassId() {
		return this.shareClassId;
	}

	@Override
	public String getCountry() {
		return this.country;
	}

	@Override
	public String toString() {
		return "[documentId=" + documentId
				+ ", performanceId=" + performanceId + ", shareClassId="
				+ shareClassId + ", country=" + country + "]";
	}
	
	

}
