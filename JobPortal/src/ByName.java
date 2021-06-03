import java.util.Comparator;

public class ByName implements Comparator<Candidate> {

	@Override
	public int compare(Candidate o1, Candidate o2) {

		String s1 = o1.candidateName;
		String s2 = o2.candidateName;

		return s1.compareTo(s2);
	}

}
