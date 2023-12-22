import java.util.Date;

public class Project {

	public String name;
	public Date start;
	public Date end;

	public int getProjectCompletePercentage() {
		if (end.getTime()<new Date().getTime()){
			return 100;
		}
		else {
			Date current = new Date();
			long diff1 = end.getTime() - start.getTime();
			long diff2 = end.getTime() - current.getTime();
			double res = ((double) diff2/diff1);
			return 100 - (int)(res*100);
		}
	}

}