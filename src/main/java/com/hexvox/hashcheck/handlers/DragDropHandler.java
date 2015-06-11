package com.hexvox.hashcheck.handlers;

import com.hexvox.hashcheck.AlgorithmToUse;
import com.hexvox.hashcheck.HashUtil;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

/**
 *
 * @author sakillin
 */
public class DragDropHandler extends TransferHandler {

   private final AlgorithmToUse algorithmToUse;
   private final JTextField destination;

   public DragDropHandler(AlgorithmToUse algorithmToUse, JTextField destination) {
      this.algorithmToUse = algorithmToUse;
      this.destination = destination;
   }

   @Override
   public boolean canImport(TransferHandler.TransferSupport info) {
      return info.isDataFlavorSupported(DataFlavor.javaFileListFlavor);
   }

   @Override
   public boolean importData(TransferHandler.TransferSupport info) {
      if (!info.isDrop()) {
         return false;
      }

      if (!info.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
         System.out.println("This drop is not supported");
         return false;
      }

      Transferable t = info.getTransferable();
      List<File> data;
      try {
         data = (List<File>) t.getTransferData(DataFlavor.javaFileListFlavor);
      } catch (UnsupportedFlavorException | IOException e) {
         System.out.println("Error getting data");
         return false;
      }

      for (File file : data) {
         String fileHash = HashUtil.getHash(file, this.algorithmToUse);
         System.out.println(file.getName() + " " + fileHash);
         destination.setText(fileHash);
      }

      return true;
   }
}
