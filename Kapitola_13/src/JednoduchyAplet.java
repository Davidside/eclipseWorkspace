import java.applet.Applet;
import java.awt.Graphics;

/*
 * <applet code="JednoduchyAplet" width=200 height=60>
 * </applet>
 */

public class JednoduchyAplet extends Applet {
	public void paint(Graphics g) {
		g.drawString("Jednoduchy aplet", 50, 50);
		g.drawLine(50, 60, 145, 60);
	}
}
