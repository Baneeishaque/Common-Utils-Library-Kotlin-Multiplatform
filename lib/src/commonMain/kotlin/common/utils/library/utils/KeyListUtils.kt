package common.utils.library.utils

import kotlin.jvm.JvmStatic

object KeyListUtils {

    @JvmStatic
    fun<K,V> addElementToKeyListPair(

        keyList: LinkedHashMap<K, MutableList<V>>,
        desiredKey: K,
        desiredElement: V

    ): LinkedHashMap<K, MutableList<V>> {

        val desiredKeyList: MutableList<V> =
            keyList.getOrElse(
                key = desiredKey,
                defaultValue = fun(): MutableList<V> = mutableListOf(),
            )
        desiredKeyList.add(element = desiredElement)
        keyList[desiredKey] = desiredKeyList
        return keyList
    }
}
