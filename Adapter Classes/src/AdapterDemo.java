import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AdapterDemo extends Applet{
	public void init() {
		addMouseListener(new MyMouseAdapter(this));
	}
}
class MyMouseAdapter extends MouseAdapter{
	AdapterDemo d;
	public MyMouseAdapter(AdapterDemo d) {
		this.d=d;
	}
	public void MouseClicked(MouseEvent me) {
		d.showStatus(null);
	}
}
