package com.senseidb.search.relevance.impl;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.MultiValueWithWeightFacetDataCache;
import com.browseengine.bobo.facets.data.TermShortList;
import com.browseengine.bobo.facets.data.TermStringList;
import org.apache.lucene.search.DocIdSetIterator;

public class WeightedMFacetString extends MFacetString implements WeightedMFacet
{
    MultiValueWithWeightFacetDataCache _wmDataCaches;
    public WeightedMFacetString(MultiValueFacetDataCache mDataCaches)
    {
        super(mDataCaches);

        _wmDataCaches = (MultiValueWithWeightFacetDataCache) mDataCaches;
    }


    @Override
    public int getWeight()
    {
        return _weight;
    }

    public boolean hasWeight(String target){
        return getWeight(target) >= 0;
    }

    public int getWeight(String target)
    {
        TermStringList intList = (TermStringList) _mTermList;
        int index = intList.indexOf(target);

        _weight = _wmDataCaches.getWeightForValue(_id, index, Integer.MIN_VALUE);
//        System.out.println("The weight is " + _weight + " for target " + target);
        return _weight;
    }
}
