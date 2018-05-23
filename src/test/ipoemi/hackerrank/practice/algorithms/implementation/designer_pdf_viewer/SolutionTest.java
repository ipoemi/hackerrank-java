package ipoemi.hackerrank.practice.algorithms.implementation.designer_pdf_viewer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void designerPdfViewer() {
        int[] heights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int sol = Solution.designerPdfViewer(heights, "abc");
        assertEquals(9, sol);

        heights = new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        sol = Solution.designerPdfViewer(heights, "zaba");
        assertEquals(28, sol);
    }
}