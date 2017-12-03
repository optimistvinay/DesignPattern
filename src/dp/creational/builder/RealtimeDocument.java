package dp.creational.builder;

public class RealtimeDocument {

	public static class Builder {
		private Integer documentId;
		private String performanceId;
		private String shareClassId;
		private String country;
		
		public Builder() {

		}
		
		public RealtimeDocument builder(){
			return new RealtimeDocument(this);
		}
		 
		
		public Builder documentId(Integer documentId){
			this.documentId = documentId;
			return this;
		}
		
		public Builder performanceId(String performanceId){
			this.performanceId = performanceId;
			return this;
		}
		
		public Builder shareClassId(String shareClassId){
			this.shareClassId = shareClassId;
			return this;
		}
		
		public Builder country(String country){
			this.country = country;
			return this;
		}
		
		
	}
	
	

	private RealtimeDocument(Builder builder) {

		this.documentId = builder.documentId;
		this.country = builder.country;
		this.performanceId = builder.performanceId;
		this.shareClassId = builder.shareClassId;
	}
	
	private final Integer documentId;
	private final String performanceId;
	private final String shareClassId;
	private final String country;
	
	public Integer getDocumentId() {
		return documentId;
	}
	public String getPerformanceId() {
		return performanceId;
	}
	
	public String getShareClassId() {
		return shareClassId;
	}
	public String getCountry() {
		return country;
	}
	@Override
	public String toString() {
		return "RealtimeDocument [documentId=" + documentId + ", performanceId="
				+ performanceId + ", shareClassId=" + shareClassId
				+ ", country=" + country + "]";
	}
	
	
	
}
