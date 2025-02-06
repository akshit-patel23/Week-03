package challengeproblemtest.searchingproblemstest;



import binarysearch.firstandlastoccurence.FirstAndLastOccurence;
import org.junit.Assert;
import org.junit.Test;

import static challengeproblems.searchingproblem.LinearSearch.linearSearch;
import static challengeproblems.searchingproblem.BinarySearch.binarySearch;
import static challengeproblems.searchingproblem.LinearSearch.linearSearch;

public class SearchingProblemsTest {
    @Test
    public void tester(){
        FirstAndLastOccurence firstlast=new FirstAndLastOccurence();
        int arr[]={1,2,3,4,6,7,8,9};
        int ansOfLinear=linearSearch(arr);
        int ansOfBinary=binarySearch(arr,6);
        Assert.assertEquals(5,ansOfLinear);
        Assert.assertEquals(4,ansOfBinary);


    }
}
