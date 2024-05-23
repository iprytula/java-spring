import java.util.Comparator;

import devices.ElectronicDevice;

public class ElectronicDeviceWattComparator implements Comparator<ElectronicDevice> {

  @Override
  public int compare(ElectronicDevice ea1, ElectronicDevice ea2) {
    System.out.println(ea1 + " is compared with " + ea2);
    return Integer.compare(ea1.getWatt(), ea2.getWatt());
  }
}