inherit distutils3-base

# resolves missing #include <crypt.h>
DEPENDS += " \
    libxcrypt \
    rosidl-default-runtime \
" 