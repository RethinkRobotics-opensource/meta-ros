ROS_DISTRO = "humble"

EXTRA_OECMAKE:append = " \
    -DPYTHON_INSTALL_DIR=lib/${PYTHON_DIR}/site-packages \
    -DPython3_NumPy_INCLUDE_DIR=${STAGING_DIR_TARGET}/usr/lib/${PYTHON_DIR}/site-packages/numpy/core/include/ \
"


inherit setuptools3-base
inherit pkgconfig 
inherit ${ROS_DISTRO_TYPE}_distro
