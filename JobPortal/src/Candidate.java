
public class Candidate {

	public String candidateName;
	public double percentage;
	
	
	public String getCandidateName() {
		return candidateName;
	}


	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}


	public double getPercentage() {
		return percentage;
	}


	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	public Candidate(String candidateName, double percentage) {
		this.candidateName = candidateName;
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		return "Candidate [candidateName=" + candidateName + ", percentage=" + percentage + "]";
	}
		
}
