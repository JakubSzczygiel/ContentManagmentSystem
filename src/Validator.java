public class Validator {


    public boolean isSizeIsFine(float fileSize) {
        if (fileSize <= File.threshold) {
            return true;
        } else {
            System.out.println("File size is to big. It can't be created");
            return false;
        }
    }

    public boolean isResolutionFine(float height, float length) {
        if (height <= MediaFile.heightThreshold && length <= MediaFile.lengthThreshold) {
            return true;
        } else {
            System.out.println("File resolution is to big. It can't be created");
            return false;
        }
    }

    public boolean isAccessLevelFine(User user, int AccessLevel) {
        if (AccessLevel >= user.getAccessLevel()) {
            return true;
        } else {
            System.out.println(user.getName() + " is a " + user.getClass().getName() + " so doesn't have rights to create a file");
            return false;
        }
    }
}