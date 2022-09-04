import java.time.LocalTime;

public class home {
    public static void main(String[] args) {
        // an array of 500 elements
        int[] nums =  {5, 118, 130, 249, 129, 492, 104, 412, 14, 476, 475, 134, 182, 426, 164, 194, 401, 368, 376, 324, 90, 99, 63, 174, 279, 95, 417, 200, 58, 232, 302, 284, 476, 8, 459, 366, 245, 357, 115, 347, 264, 6, 252, 123, 20, 152, 73, 443, 484, 62, 260, 121, 324, 452, 327, 5, 296, 348, 211, 497, 330, 193, 13, 151, 163, 340, 184, 33, 447, 447, 193, 415, 239, 175, 276, 146, 389, 200, 90, 197, 24, 460, 182, 137, 234, 368, 143, 140, 164, 395, 401, 113, 81, 72, 217, 105, 327, 329, 374, 349, 148, 281, 388, 395, 388, 68, 10, 362, 153, 29, 106, 169, 265, 393, 472, 9, 429, 71, 154, 426, 215, 264, 330, 138, 239, 149, 299, 146, 393, 437, 189, 367, 290, 262, 164, 1, 6, 356, 399, 408, 369, 159, 266, 243, 338, 214, 179, 238, 326, 374, 48, 228, 37, 332, 107, 259, 203, 319, 265, 41, 299, 384, 289, 391, 104, 135, 419, 211, 415, 30, 473, 238, 286, 136, 183, 303, 257, 439, 95, 365, 185, 133, 298, 464, 443, 357, 229, 31, 74, 253, 18, 472, 429, 111, 310, 74, 59, 499, 286, 362, 347, 369, 273, 345, 363, 297, 298, 158, 148, 159, 249, 178, 243, 492, 268, 456, 440, 438, 51, 246, 68, 494, 454, 206, 50, 21, 84, 347, 303, 97, 22, 204, 265, 80, 262, 45, 483, 253, 293, 23, 31, 269, 71, 458, 131, 223, 359, 147, 271, 351, 361, 417, 61, 403, 153, 273, 465, 215, 229, 75, 250, 131, 295, 25, 407, 43, 129, 410, 117, 475, 342, 354, 68, 288, 441, 35, 150, 54, 396, 370, 498, 399, 18, 103, 204, 355, 39, 43, 454, 194, 125, 430, 215, 355, 411, 354, 218, 405, 336, 429, 222, 447, 436, 339, 323, 382, 280, 314, 40, 378, 182, 445, 264, 390, 91, 67, 278, 465, 293, 451, 84, 473, 128, 491, 281, 232, 409, 53, 134, 434, 2, 39, 416, 329, 148, 305, 70, 448, 295, 485, 427, 74, 31, 163, 483, 148, 222, 40, 194, 198, 284, 290, 102, 480, 90, 487, 115, 186, 113, 148, 288, 476, 360, 308, 1, 164, 59, 274, 302, 393, 434, 228, 404, 22, 36, 279, 41, 421, 362, 121, 254, 340, 426, 149, 122, 148, 66, 340, 117, 356, 6, 468, 90, 166, 202, 81, 253, 253, 480, 355, 148, 497, 120, 385, 401, 439, 251, 131, 333, 461, 441, 383, 348, 221, 405, 378, 220, 157, 432, 274, 368, 45, 62, 153, 114, 265, 133, 238, 290, 183, 491, 342, 203, 77, 381, 139, 385, 334, 415, 60, 171, 277, 73, 444, 75, 54, 183, 476, 480, 425, 400, 456, 467, 405, 477, 224, 40, 242, 346, 395, 184, 33, 311, 211, 201, 162, 486, 203, 258, 177, 303, 370, 237, 358, 363, 196, 277, 483, 69, 327, 16, 302, 36, 214, 433, 295, 66, 246, 95, 207, 447, 192, 227, 269, 102, 46, 208, 276, 343, 300, 449};

        // normal linear search
        long timeNano1 = System.nanoTime(); // start time
        for(int i = 0 ; i <nums.length ; i++)
        {
            if(nums[i] == 449) System.out.println("Found at " + i);
        }        
        
        long timeNano2 = System.nanoTime(); // end time
        System.out.println("Time taken for the code to execute: " + (timeNano2 - timeNano1) + " nanoseconds");
        
        thread t[] = new thread[5]; // array of objects
        // intializig the array of objects
        for(int i = 0; i < t.length ; i++)
        {
            t[i] = new thread(nums, i*100, (i*100)+100, 449);
        }

        timeNano1 = System.nanoTime(); // time start

        // starting the thread
        for(int i = 0; i < t.length ; i++)
        {
            t[i].start();
        }
        timeNano2 = System.nanoTime(); // time end
        System.out.println("Time taken for the code to execute: " + (timeNano2 - timeNano1) + " nanoseconds");
    }
}

/*

5, 118, 130, 249, 129, 492, 104, 412, 14, 476, 475, 134, 182, 426, 164, 194, 401, 368, 376, 324, 90, 99, 63, 174, 279, 95, 417, 200, 58, 232, 302, 284, 476, 8, 459, 366, 245, 357, 115, 347, 264, 6, 252, 123, 20, 152, 73, 443, 484, 62, 260, 121, 324, 452, 327, 5, 296, 348, 211, 497, 330, 193, 13, 151, 163, 340, 184, 33, 447, 447, 193, 415, 239, 175, 276, 146, 389, 200, 90, 197, 24, 460, 182, 137, 234, 368, 143, 140, 164, 395, 401, 113, 81, 72, 217, 105, 327, 329, 374, 349, 148, 281, 388, 395, 388, 68, 10, 362, 153, 29, 106, 169, 265, 393, 472, 9, 429, 71, 154, 426, 215, 264, 330, 138, 239, 149, 299, 146, 393, 437, 189, 367, 290, 262, 164, 1, 6, 356, 399, 408, 369, 159, 266, 243, 338, 214, 179, 238, 326, 374, 48, 228, 37, 332, 107, 259, 203, 319, 265, 41, 299, 384, 289, 391, 104, 135, 419, 211, 415, 30, 473, 238, 286, 136, 183, 303, 257, 439, 95, 365, 185, 133, 298, 464, 443, 357, 229, 31, 74, 253, 18, 472, 429, 111, 310, 74, 59, 499, 286, 362, 347, 369, 273, 345, 363, 297, 298, 158, 148, 159, 249, 178, 243, 492, 268, 456, 440, 438, 51, 246, 68, 494, 454, 206, 50, 21, 84, 347, 303, 97, 22, 204, 265, 80, 262, 45, 483, 253, 293, 23, 31, 269, 71, 458, 131, 223, 359, 147, 271, 351, 361, 417, 61, 403, 153, 273, 465, 215, 229, 75, 250, 131, 295, 25, 407, 43, 129, 410, 117, 475, 342, 354, 68, 288, 441, 35, 150, 54, 396, 370, 498, 399, 18, 103, 204, 355, 39, 43, 454, 194, 125, 430, 215, 355, 411, 354, 218, 405, 336, 429, 222, 447, 436, 339, 323, 382, 280, 314, 40, 378, 182, 445, 264, 390, 91, 67, 278, 465, 293, 451, 84, 473, 128, 491, 281, 232, 409, 53, 134, 434, 2, 39, 416, 329, 148, 305, 70, 448, 295, 485, 427, 74, 31, 163, 483, 148, 222, 40, 194, 198, 284, 290, 102, 480, 90, 487, 115, 186, 113, 148, 288, 476, 360, 308, 1, 164, 59, 274, 302, 393, 434, 228, 404, 22, 36, 279, 41, 421, 362, 121, 254, 340, 426, 149, 122, 148, 66, 340, 117, 356, 6, 468, 90, 166, 202, 81, 253, 253, 480, 355, 148, 497, 120, 385, 401, 439, 251, 131, 333, 461, 441, 383, 348, 221, 405, 378, 220, 157, 432, 274, 368, 45, 62, 153, 114, 265, 133, 238, 290, 183, 491, 342, 203, 77, 381, 139, 385, 334, 415, 60, 171, 277, 73, 444, 75, 54, 183, 476, 480, 425, 400, 456, 467, 405, 477, 224, 40, 242, 346, 395, 184, 33, 311, 211, 201, 162, 486, 203, 258, 177, 303, 370, 237, 358, 363, 196, 277, 483, 69, 327, 16, 302, 36, 214, 433, 295, 66, 246, 95, 207, 447, 192, 227, 269, 102, 46, 208, 276, 343, 300, 449
 */
