package binarysearchtest.rotationpointtest;



import binarysearch.firstandlastoccurence.FirstAndLastOccurence;
import binarysearch.rotationpoint.RotationPoint;
import org.junit.Assert;
import org.junit.Test;


public class RotationPointTest {
    @Test
    public void tester(){
        RotationPoint obj=new RotationPoint();
        int[] arr={8,9,0,2,3,4,5,6,7};
        int ans=obj.search(arr);

        Assert.assertEquals(ans,0);

    }


}