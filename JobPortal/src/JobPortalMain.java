import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class JobPortalMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TreeSet<Candidate> treeSet = new TreeSet<Candidate>(new ByName());

		String res = null;

		System.out.println("CANDIDATE REGISTRATION");

		do {
			System.out.println("Enter the candidate name: ");
			String candidateName = sc.next();

			System.out.println("Enter the candidate percentage");
			double percentage = sc.nextDouble();

			Candidate c = new Candidate(candidateName, percentage);

			boolean rs = treeSet.add(c);

			if (rs) {
				System.out.println("Candidate successfully added");
			} else {
				System.err.println("Failed to add Candidate (alredy exist)");
			}

			System.out.println("Do you have more items to add? (Yes/No)");
			res = sc.next();
		} while (res.equalsIgnoreCase("yes"));

		System.out.println("------------------------------------------------------");

		System.out.println("REGISTERED CANDIDATES ARE");

		Iterator<Candidate> itr = treeSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-------------------------------------------------------");

		System.out.println("COMPANY ELEGIBILITY");
		System.out.println("enter the criteria: ");
		double criteria = sc.nextDouble();

		System.out.println("-------------------------------------------------------");

		System.out.println("COMPANY ELEGIBILITY CRETERIA IS: " + criteria);
		System.out.println("The list of candidates eligible are");

		ArrayList<Candidate> al = new ArrayList<Candidate>();
		al.addAll(treeSet);

		for (int i = 0; i < al.size(); i++) {
			Candidate c = al.get(i);

			if (c.percentage >= criteria)
				System.out.println(al.get(i));

		}

	}

}
