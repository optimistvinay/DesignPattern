package dp.structural.adapter;

public class MstarDocumentAdapter implements SearchDocument {

	private MstarDocument mstarDoc;
	
	
	
	public MstarDocumentAdapter(MstarDocument mstarDoc) {
		this.mstarDoc = mstarDoc;
	}

	@Override
	public String getDocumentId() {
		return this.mstarDoc.getId();
	}

	@Override
	public String getPerformanceId() {
		return this.mstarDoc.getpId();
	}

	@Override
	public String getShareClassId() {
		return this.mstarDoc.getSc();
	}

	@Override
	public String getCountry() {
		return this.mstarDoc.getRegion();
	}

	@Override
	public String toString() {
		return "[documentId=" + getDocumentId()
				+ ", performanceId=" + getPerformanceId() + ", shareClassId="
				+ getShareClassId() + ", country=" + getCountry() + "]";
	}
	
}
