import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestAdapter extends Applet 
{ 
	public void init() 
	{ 
		addMouseListener(new MAdapter(this)); 
	} 
} 
class MAdapter extends MouseAdapter 
 	{ 
	TestAdapter tAdapter; 
	public MAdapter(TestAdapter tAdapter) 
	{ 
			this.tAdapter = tAdapter; 
	}
	//Handling Mouse clicked event 
	public void mouseClicked(MouseEvent me) 
	{ 
		tAdapter.showStatus("Mouse Clicked"); 
	} 
	//Handling Mouse Release event 
	public void mouseReleased(MouseEvent me) 
 	{ 
		tAdapter.showStatus("Mouse Released"); 
 	} 
 }
