package pw.avvero.leet.year2026_02;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Problem811 {

    class Domain {
        String name = null;
        int count = 0;
        HashMap<String, Domain> subs = new HashMap<>();
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        Domain root = new Domain();
        for (String cpdomain : cpdomains) {
            String[] cpd = cpdomain.split(" ");
            Integer count = Integer.valueOf(cpd[0]);
            String[] domains = cpd[1].split("\\.");
            count(root, domains, domains.length - 1, count);
        }
        List<String> result = new ArrayList<>();
        print(result, root);
        return result;
    }

    private void print(List<String> result, Domain domain) {
        if (domain.name != null) {
            result.add(domain.count + " " + domain.name);
        }
        for (Domain sub : domain.subs.values()) {
            print(result, sub);
        }
    }

    private void count(Domain root, String[] domains, int i, Integer count) {
        if (i < 0) return;
        String name = domains[i];
        Domain sub = root.subs.get(name);
        if (sub == null) {
            sub = new Domain();
            sub.name = name;
            root.subs.put(name, sub);
        }
        sub.count += count;
        count(sub, domains, i - 1, count);
    }
}
