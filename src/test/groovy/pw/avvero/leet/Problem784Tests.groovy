package pw.avvero.leet

import spock.lang.Specification
import spock.lang.Unroll

class Problem784Tests extends Specification {

    @Unroll
    def "test"() {
        expect:
        new Problem784().letterCasePermutation(str) == result
        where:
        str        || result
        "a1b2"     || ["a1b2", "a1B2", "A1b2", "A1B2"]
        "3z4"      || ["3Z4", "3z4"]
        "mQe"      || ["mqe", "mqE", "mQe", "mQE", "Mqe", "MqE", "MQe", "MQE"]
        "FjkZh"    || ["fjkzh", "fjkzH", "fjkZh", "fjkZH", "fjKzh", "fjKzH", "fjKZh", "fjKZH", "fJkzh", "fJkzH", "fJkZh", "fJkZH", "fJKzh", "fJKzH", "fJKZh", "fJKZH", "Fjkzh", "FjkzH", "FjkZh", "FjkZH", "FjKzh", "FjKzH", "FjKZh", "FjKZH", "FJkzh", "FJkzH", "FJkZh", "FJkZH", "FJKzh", "FJKzH", "FJKZh", "FJKZH"]
        "LzYracpd" || ["fjkzh", "fjkzH", "fjkZh", "fjkZH", "fjKzh", "fjKzH", "fjKZh", "fjKZH", "fJkzh", "fJkzH", "fJkZh", "fJkZH", "fJKzh", "fJKzH", "fJKZh", "fJKZH", "Fjkzh", "FjkzH", "FjkZh", "FjkZH", "FjKzh", "FjKzH", "FjKZh", "FjKZH", "FJkzh", "FJkzH", "FJkZh", "FJkZH", "FJKzh", "FJKzH", "FJKZh", "FJKZH"]
    }

}
