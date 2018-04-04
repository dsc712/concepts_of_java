import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Table
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Table");
		frame.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				Window win = e.getWindow();
				win.setVisible(false);
				win.dispose();
				System.exit(0);
			}
		} );
		
		
		// Create your own sub-class of JTable rather than using anonymous class
		JTable table = new JTable( 15, 3 )
			{
				public Component prepareRenderer(TableCellRenderer renderer, int row, int column) 
				{
					Component c = super.prepareRenderer( renderer, row, column);
					// We want renderer component to be transparent so background image is visible
					if( c instanceof JComponent )
						((JComponent)c).setOpaque(false);
					return c;
				}
		
				// Hard coded value. In your sub-class add a function for this.
				ImageIcon image = new ImageIcon( "codeguruwm.gif" );

				public void paint( Graphics g )
				{
					// First draw the background image - tiled 
					Dimension d = getSize();
					for( int x = 0; x < d.width; x += image.getIconWidth() )
						for( int y = 0; y < d.height; y += image.getIconHeight() )
							g.drawImage( image.getImage(), x, y, null, null );
					// Now let the regular paint code do it's work
					super.paint(g);
				}
				
			};
		// Set the table transparent
		table.setOpaque(false);
		
		JScrollPane sp = new JScrollPane( table );
		frame.getContentPane().add( sp );
		
		frame.pack();
		frame.show();
	}
}
