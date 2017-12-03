package dp.creational.builder;

public class TestBuilder {

	public static void main(String[] args) {

		RealtimeDocument.Builder builder = new RealtimeDocument.Builder();

		RealtimeDocument doc = builder.documentId(123).country("IND")
				.performanceId("P002").shareClassId("SH45").builder();
		
		System.out.println(doc);
	}

}
