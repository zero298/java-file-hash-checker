package hashcheck.handlers;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

/**
 *
 * @author sakillin
 */
public class TextDropHandler extends TransferHandler {

   private final JTextField destination;

   public TextDropHandler(JTextField destination) {
      this.destination = destination;
   }

   @Override
   public boolean canImport(TransferHandler.TransferSupport info) {
      return info.isDataFlavorSupported(DataFlavor.stringFlavor);
   }

   @Override
   public boolean importData(TransferHandler.TransferSupport info) {
      if (!info.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         System.out.println("This drop is not supported");
         return false;
      }

      Transferable t = info.getTransferable();
      String data;
      try {
         data = ((String) t.getTransferData(DataFlavor.stringFlavor)).trim();
      } catch (UnsupportedFlavorException | IOException e) {
         System.out.println("Error getting data");
         return false;
      }

      System.out.println(data);
      destination.setText(data);

      return true;
   }

}
