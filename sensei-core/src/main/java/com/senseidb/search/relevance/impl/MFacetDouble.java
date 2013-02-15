package com.senseidb.search.relevance.impl;

import com.browseengine.bobo.facets.data.TermIntList;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;

import java.util.Set;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.TermDoubleList;

public class MFacetDouble extends MFacet
{

  public MFacetDouble(MultiValueFacetDataCache mDataCaches)
  {
    super(mDataCaches);
  }

  @Override
  public boolean containsAll(Set set)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }

  public boolean containsAll(double[] target)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }

  public boolean contains(double target)
  {
      TermDoubleList list = (TermDoubleList) _mTermList;
      int index = list.indexOf(target);
      return index >= 0 && _mDataCaches.contains(_id, index);
  }
  
}
