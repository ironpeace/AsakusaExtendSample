package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.csv.AbstractOriginalDataCsvInputDescription;

public class OriginaldataFromCsv extends AbstractOriginalDataCsvInputDescription {

	@Override
	public String getBasePath() {
		return "ironpeace/input/";
	}

	@Override
	public String getResourcePattern() {
		return "originaldata.csv";
	}

}
