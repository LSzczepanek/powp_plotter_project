package edu.iis.powp.drawer;

import edu.kis.powp.drawer.panel.DefaultDrawerFrame;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

/**
 * Drawer test.
 * 
 * @author Dominik
 */
public class TestDrawer
{
    /**
     * Drawer test.
     */
    public static void main(String[] args)
    {
        DrawPanelController controller = new DrawPanelController();
        DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
        ILine line = LineFactory.getBasicLine();
        ILine line2 = LineFactory.getDottedLine();
        line2.setStartCoordinates(0, 0);
        line2.setEndCoordinates(0, 0);
        controller.drawLine(line2);
    }
}
