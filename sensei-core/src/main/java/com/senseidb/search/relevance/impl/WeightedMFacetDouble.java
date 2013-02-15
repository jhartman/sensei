package com.senseidb.search.relevance.impl;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.MultiValueWithWeightFacetDataCache;
import com.browseengine.bobo.facets.data.TermDoubleList;
import com.browseengine.bobo.facets.data.TermFloatList;
import org.apache.lucene.search.DocIdSetIterator;

public class WeightedMFacetDouble extends MFacetDouble implements WeightedMFacet
{
    MultiValueWithWeightFacetDataCache _wmDataCaches;
    public WeightedMFacetDouble(MultiValueFacetDataCache mDataCaches)
    {
        super(mDataCaches);

        _wmDataCaches = (MultiValueWithWeightFacetDataCache) mDataCaches;
    }

    @Override
    public int getWeight()
    {
        return getWeight(0.0);
    }

    public int getWeight(double target)
    {
        TermDoubleList intList = (TermDoubleList) _mTermList;
        int index = intList.indexOf(target);

        _weight = _wmDataCaches.getWeightForValue(_id, index, Integer.MIN_VALUE);
        return _weight;
    }
}
