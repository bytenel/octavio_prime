/**
 *
 */
package primality2;

import java.util.LinkedHashSet;

/**
 * @author opimentel
 *
 */
public class ErathostenesSqrt
{

    /**
     * @param args
     */
    public static void main (String[] args)
    {
        // TODO Auto-generated method stub
        LinkedHashSet<Integer> primes = new LinkedHashSet<Integer>();
        primes.add(2);
        primes.add(3);

        int candidate = 3;

//        long start = System.nanoTime();

        here:
        while (primes.size() < 2000)
        {
            candidate += 2;

            for (Integer p : primes)
            {
                if (candidate % p == 0)
                {
                    continue here;
                }

                if (p >= Math.sqrt(candidate))
                {
                    primes.add(candidate);
//                    System.out.println(candidate);
                     continue here;
                }

            }

        }
//        System.out.println(System.nanoTime() - start);
        System.out.println(candidate);

    }

}