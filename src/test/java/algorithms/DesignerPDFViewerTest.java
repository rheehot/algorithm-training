package test.java.algorithms;

import main.java.algorithms.DesignerPDFViewer;
import org.junit.Test;

import static org.junit.Assert.*;

public class DesignerPDFViewerTest {

    @Test
    public void test() {
        //Given
        int[] height = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String word = "zaba";
        //When
        int result = DesignerPDFViewer.designerPdfViewer(height, word);

        //then
        assertEquals(28, result);
    }

}