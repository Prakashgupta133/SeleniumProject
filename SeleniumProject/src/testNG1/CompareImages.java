package testNG1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.testng.Assert;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
public class CompareImages {

	public static void main(String[] args) throws IOException {
		
		BufferedImage expected=ImageIO.read(new File("D:\\1.jpg"));
		//BufferedImage actual=ImageIO.read(new File("D:\\1 - Copy.jpg"));
	   BufferedImage actual=ImageIO.read(new File("D:\\2.jpg"));
	   
	   BufferedImage expected1=ImageIO.read(new File("D:\\4-46414_image-lion-tribal-tattoo-png.png"));
		BufferedImage actual1=ImageIO.read(new File("D:\\4-46414_image-lion-tribal-tattoo-png.png"));
	   //BufferedImage actual1=ImageIO.read(new File("D:\\71bb44e35720a09f34c196d1060079a7.png"));
		
		
		ImageDiffer differ=new ImageDiffer();
		ImageDiff diff=differ.makeDiff(expected1,actual1);
		System.out.println("Pictures are different: "+diff.hasDiff());
		
		try
		{
			Assert.assertFalse(diff.hasDiff(),"Images are different");
			
		}catch(AssertionError e)
		{
			System.out.println(e.getMessage());
		}
	}

}
