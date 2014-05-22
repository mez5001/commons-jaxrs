package edu.psu.util.string;

import java.util.Comparator;

public class CaseInsensitiveStringComparator implements Comparator<String>
{
  @Override
  public int compare(String o1, String o2)
  {
    return o1.compareToIgnoreCase(o2);
  }
}
