package com.senseidb.search.relevance.impl;

import com.browseengine.bobo.facets.data.TermDoubleList;
import it.unimi.dsi.fastutil.floats.FloatOpenHashSet;

import java.util.Set;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.TermFloatList;

public class MFacetFloat extends MFacet
{

  public MFacetFloat(MultiValueFacetDataCache mDataCaches)
  {
    super(mDataCaches);
  }

  @Override
  public boolean containsAll(Set set)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }
  
  public boolean containsAll(float[] target)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }
  
  public boolean contains(float target)
  {
      TermFloatList list = (TermFloatList) _mTermList;
      int index = list.indexOf(target);
      return index >= 0 && _mDataCaches.contains(_id, index);

  }

}
