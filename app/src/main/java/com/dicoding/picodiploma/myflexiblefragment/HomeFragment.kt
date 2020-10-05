class HomeFragment : Fragment(), View.OnClickListener {

    ...

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnCategory:Button = view.findViewById(R.id.btn_category)
        btnCategory.setOnClickListener(this)    }
    override fun onClick(v: View) {
            if (v.id == R.id.btn_category) {
                val mCategoryFragment = CategoryFragment()
                val mFragmentManager = fragmentManager
                mFragmentManager?.beginTransaction()?.apply {
                    replace(R.id.frame_container, mCategoryFragment, CategoryFragment::class.java.simpleName)
                    addToBackStack(null)
                    commit()
                }
            }
        }


    }
}