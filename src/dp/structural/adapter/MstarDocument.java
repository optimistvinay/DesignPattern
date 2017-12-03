package dp.structural.adapter;

public class MstarDocument {
	
	private String id;
	
	private String pId;
	
	private String sc;
	
	private String region;

	public MstarDocument(String id, String pId, String sc, String region) {
		this.id = id;
		this.pId = pId;
		this.sc = sc;
		this.region = region;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getSc() {
		return sc;
	}

	public void setSc(String sc) {
		this.sc = sc;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
	
	

}
