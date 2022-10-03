LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dcaaaf1a01e7f9ceb200d383a0d4320c"
SRC_URI = "git://github.com/mfontanini/libtins.git;protocol=https;branch=master"

# Modify these as desired
PV = "4.4"
SRCREV = "e3aedc56edc7e9f39170c195de9a886a4309b0cb"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen PCAP
DEPENDS = " \
    openssl \
    boost \
    libpcap \
"

inherit cmake
