import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={10,2,1,7};
        int end[]={16,8,6,12};
        int maxAct=0;
        //if not sorted
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer>ans=new ArrayList<>();
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1;i<end.length;i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = activities[i][2];
            }
        }

        System.out.println(maxAct);

        for(int i=0;i<ans.size() ;i++){
            System.out.print("A"+ans.get(i) +" ");
        }
        System.out.println();
    }
}
