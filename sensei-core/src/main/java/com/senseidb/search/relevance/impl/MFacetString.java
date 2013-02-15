package com.senseidb.search.relevance.impl;

import com.browseengine.bobo.facets.data.TermLongList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;

import java.util.Set;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.TermStringList;

public class MFacetString extends MFacet
{

  public MFacetString(MultiValueFacetDataCache mDataCaches)
  {
    super(mDataCaches);
  }

  @Override
  public boolean containsAll(Set set)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }

  public boolean containsAll(String[] target)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }

  public boolean contains(String target)
  {
      TermStringList list = (TermStringList) _mTermList;
      int index = list.indexOf(target);
      boolean contained = index >= 0 && _mDataCaches.contains(_id, index);
      System.out.println("Contained " + target + " is " + contained);
      return contained;
  }
  
}
