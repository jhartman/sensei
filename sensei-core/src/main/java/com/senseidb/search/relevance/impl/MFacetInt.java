package com.senseidb.search.relevance.impl;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;

import java.io.IOException;
import java.util.Set;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.TermIntList;
import org.apache.lucene.search.DocIdSetIterator;

public class MFacetInt extends MFacet
{

  public MFacetInt(MultiValueFacetDataCache mDataCaches)
  {
    super(mDataCaches);
  }

  @Override
  public boolean containsAll(Set set)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }
  
  public boolean containsAll(int[] target)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }
  
  public boolean contains(int target)
  {
      TermIntList intList = (TermIntList) _mTermList;
      int index = intList.indexOf(target);
      return index >= 0 && _mDataCaches.contains(_id, index);
  }
}
