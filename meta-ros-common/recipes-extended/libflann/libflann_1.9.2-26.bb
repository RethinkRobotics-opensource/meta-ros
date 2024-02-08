DESCRIPTION = "Fast Library for Approximate Nearest Neighbors"
AUTHOR = "Marius Muja and David G. Lowe"
HOMEPAGE = "http://www.cs.ubc.ca/~mariusm/index.php/FLANN/FLANN"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=395adad2339bd9ce5fef13d564a9681c"

SRCREV = "f9caaf609d8b8cb2b7104a85cf59eb92c275a25d"
ROS_BRANCH ?= "branch=master"
SRC_URI = "git://github.com/mariusmuja/flann;${ROS_BRANCH};protocol=https \
    file://0001-CMakeLists-use-imported-target-for-lz4.patch \
    file://0002-pkg-config-fix-for-lz4.patch \
"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = "zlib hdf5 pkgconfig-native lz4 "

# Prevent it finding python
EXTRA_OECMAKE += " \
    -UPYTHON_EXECUTABLE \
    -DBUILD_DOC=OFF \
    -DBUILD_EXAMPLES=OFF \
    -DBUILD_MATLAB_BINDINGS=OFF \
    -DBUILD_PYTHON_BINDINGS=OFF \
    -DBUILD_TESTS=OFF \
    "
