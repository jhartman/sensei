package com.senseidb.search.relevance.impl;

import com.browseengine.bobo.facets.data.TermDoubleList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

import java.util.Set;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.TermLongList;

public class MFacetLong extends MFacet
{

  public MFacetLong(MultiValueFacetDataCache mDataCaches)
  {
    super(mDataCaches);
  }

  @Override
  public boolean containsAll(Set set)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }
  
  public boolean containsAll(long[] target)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }

  public boolean contains(long target)
  {
      TermLongList list = (TermLongList) _mTermList;
      int index = list.indexOf(target);
      return index >= 0 && _mDataCaches.contains(_id, index);

  }

}
