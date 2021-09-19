
public class VotingCountRunner {

	public static void main(String[] args) {
		VotingCount a= new VotingCount();
		VotingCount b= new VotingCount();
		VotingCount c= new VotingCount();
		System.out.println(VotingCount.getCount());
		VotingCount.setCount();
		System.out.println(VotingCount.getCount());
	}
}