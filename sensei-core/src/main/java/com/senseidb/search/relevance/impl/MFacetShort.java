package com.senseidb.search.relevance.impl;

import com.browseengine.bobo.facets.data.TermIntList;
import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;

import java.util.Set;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.TermShortList;
import org.apache.lucene.search.DocIdSetIterator;

public class MFacetShort extends MFacet
{

  public MFacetShort(MultiValueFacetDataCache mDataCaches)
  {
    super(mDataCaches);
  }

  @Override
  public boolean containsAll(Set set)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }

  public boolean containsAll(short[] target)
  {
    throw new UnsupportedOperationException("not implemented yet");
  }
  
  public boolean contains(short target)
  {
      TermShortList intList = (TermShortList) _mTermList;
      int index = intList.indexOf(target);
      int value = _mDataCaches.findValue(index, _id, _id);
      return value != DocIdSetIterator.NO_MORE_DOCS;

  }
  
}
